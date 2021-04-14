package com.utn.tpnews.service;

import com.utn.tpnews.model.New;
import com.utn.tpnews.model.Owner;
import com.utn.tpnews.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class OwnerService {

    private OwnerRepository ownerRepository;
    private NewService newService;

    @Autowired
    public OwnerService(OwnerRepository ownerRepository, NewService newService) {
        this.ownerRepository = ownerRepository;
        this.newService = newService;
    }

    public void addOwner(Owner newOwner) {
        ownerRepository.save(newOwner);
    }

    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();
    }

    public Owner getOwnerById(Integer id) {
        return ownerRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    public void addNewToOwner(Integer idOwner, Integer idNew) {
        Owner owner = getOwnerById(idOwner);
        New n = newService.getNewById(idNew);
        owner.getNews().add(n);
        ownerRepository.save(owner);
    }
}

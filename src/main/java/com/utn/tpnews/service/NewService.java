package com.utn.tpnews.service;

import com.utn.tpnews.model.New;
import com.utn.tpnews.repository.NewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class NewService {

    @Autowired
    private NewRepository newRepository;

    public void addNew(New n) {
        newRepository.save(n);
    }

    public List<New> getAll(String title) {
        if(isNull(title)){
            return newRepository.findAll();
        }
        return newRepository.findByTitle(title);

    }

    public New getNewById(Integer id) {
        return newRepository.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }
}

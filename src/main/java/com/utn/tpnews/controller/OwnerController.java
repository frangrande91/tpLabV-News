package com.utn.tpnews.controller;

import com.utn.tpnews.model.New;
import com.utn.tpnews.model.Owner;
import com.utn.tpnews.repository.NewRepository;
import com.utn.tpnews.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;
    private NewRepository repositoryNew;


    @PostMapping("/")
    public void addOwner(@RequestBody Owner newOwner){
        ownerService.addOwner(newOwner);
    }

    @GetMapping
    public List<Owner> getAllOwners(){
        return ownerService.getAllOwners();
    }

    @GetMapping("{id}")
    public Owner getOwnerById(@PathVariable Integer id){
        return ownerService.getOwnerById(id);
    }

    @PutMapping("/{idOwner}/news/{idNew}")
    public void addNewToOwner(@PathVariable Integer idOwner, @PathVariable Integer idNew){
        ownerService.addNewToOwner(idOwner, idNew);
    }
}

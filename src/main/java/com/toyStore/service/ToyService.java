package com.toyStore.service;

import com.toyStore.entity.Toy;
import com.toyStore.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToyService {

    @Autowired
    private ToyRepository tRepo;

    public void save(Toy t){
        tRepo.save(t);
    }

    public List<Toy> getAllToy(){
        return tRepo.findAll();
    }

}


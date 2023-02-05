package com.toyStore.service;

import com.toyStore.entity.MyToyList;
import com.toyStore.repository.MyToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyToyListService {

    @Autowired
    private MyToyRepository mytoy;

    public void saveMyToys(MyToyList toy){
        mytoy.save(toy);
    }

    public List<MyToyList> getAllMyToys(){
        return mytoy.findAll();
    }

    public void deleteById(int id){
        mytoy.deleteById(id);
    }

}

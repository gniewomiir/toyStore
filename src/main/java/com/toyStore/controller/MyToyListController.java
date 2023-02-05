package com.toyStore.controller;

import com.toyStore.entity.MyToyList;
import com.toyStore.service.MyToyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyToyListController {

    @Autowired
    private MyToyListService service;

    @RequestMapping("/deleteMyToy/{id}")
    public String deleteMyList(@PathVariable("id") int id){
        service.deleteById(id);
        return "redirect:/my_toys";
    }
}

package com.toyStore.controller;

import com.toyStore.entity.Toy;
import com.toyStore.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ToyController {

    @Autowired
    private ToyService service;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/toy_register")
    public String toyRegister(){
        return "toyRegister";
    }

    @GetMapping("/available_toys")
    public ModelAndView getAllToy(){
        List<Toy> list=service.getAllToy();
        ModelAndView m = new ModelAndView();
        m.setViewName("toyList");
        m.addObject("book",list);
        return new ModelAndView("toyList","toy",list);
    }

    @PostMapping("/save")
    public String addToy(@ModelAttribute Toy t){
        service.save(t);
        return "redirect:/available_toys";
    }
}

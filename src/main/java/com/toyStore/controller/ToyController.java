package com.toyStore.controller;

import com.toyStore.entity.MyToyList;
import com.toyStore.entity.Toy;
import com.toyStore.service.MyToyListService;
import com.toyStore.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ToyController {

    @Autowired
    private ToyService service;

    @Autowired
    private MyToyListService myToyService;

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
        m.addObject("toy",list);
        return new ModelAndView("toyList","toy",list);
    }

    @PostMapping("/save")
    public String addToy(@ModelAttribute Toy t){
        service.save(t);
        return "redirect:/available_toys";
    }

    @GetMapping("/my_toys")
    public String getMyToys(Model model){
        List<MyToyList>list=myToyService.getAllMyToys();
        model.addAttribute("toy",list);
        return "myToys";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Toy t=service.getToyById(id);
        MyToyList mt=new MyToyList(t.getId(),t.getName(),t.getPrice());
        myToyService.saveMyToys(mt);
        return "redirect:/my_toys";
    }

    @RequestMapping("/editToy/{id}")
    public String editToy(@PathVariable("id")int id,Model model){
        Toy t=service.getToyById(id);
        model.addAttribute("toy",t);
        return "toyEdit";
    }

    @RequestMapping("/deleteToy/{id}")
    public String deleteToy(@PathVariable("id")int id){
        service.deleteById(id);
        return "redirect:/available_toys";
    }

}

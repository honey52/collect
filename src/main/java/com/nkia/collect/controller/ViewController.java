package com.nkia.collect.controller;

import com.nkia.collect.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    CollectService collectService;

    @GetMapping("/hello")
    public String hello(Model model){

        model.addAttribute("jsonData", collectService.getApiDate());

        return "/view/hello";
    }
}

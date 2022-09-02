package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {


   private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }


    @GetMapping
    public String index(Model model)
    {
        String urlService=demoService.getUrl();
        model.addAttribute("url",urlService);
        return "index";
    }




}

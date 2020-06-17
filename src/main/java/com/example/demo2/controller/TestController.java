package com.example.demo2.controller;


import com.example.demo2.entiy.Brand;
import com.example.demo2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String  test(){
        return"hello world";
    }

    @Autowired
    private DemoService demoService;

    @RequestMapping("/brand")
    public List<Brand> findAll(){
        return demoService.findAll();
    }


}

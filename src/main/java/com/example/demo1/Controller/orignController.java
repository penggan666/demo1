package com.example.demo1.Controller;

import com.example.demo1.Repository.orignRepository;
import com.example.demo1.Service.orignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orignController {
    @Autowired
    private orignService orignService;

    @GetMapping(value = "/datass")

    public void insert()
    {
        orignService.save();
    }
    @GetMapping(value = "/url")
    public void geturl(){orignService.sumUrl();}


}

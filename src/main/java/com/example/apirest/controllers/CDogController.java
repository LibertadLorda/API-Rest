package com.example.apirest.controllers;

import com.example.apirest.models.CDog;
import com.example.apirest.services.CDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/dogs")
public class CDogController {

    @Autowired
    CDogService CDogService;

    @GetMapping
    public ArrayList<CDog> getDogs(){
        return CDogService.getDogs();
    }



}

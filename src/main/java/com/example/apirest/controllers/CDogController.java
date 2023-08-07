package com.example.apirest.controllers;

import com.example.apirest.models.CDog;
import com.example.apirest.services.CDogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/dogs")
public class CDogController {

    @Autowired
    CDogService CDogService;

    @GetMapping
    public ArrayList<CDog> getDogs(){
        return CDogService.getDogs();
    }

    @GetMapping(path = "/{id}")
    public Optional<CDog> getDogById(@PathVariable int id){
        return CDogService.getDogById(id);
    }

    @PostMapping
    public CDog postDog(CDog dogModel){
        return CDogService.postDog(dogModel);
    }

    @PutMapping
    public CDog updateDog(CDog dogModel, int id){
        return CDogService.updateDog(dogModel, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteDogById(@PathVariable int id){
        return CDogService.deleteDogById(id);
    }

}

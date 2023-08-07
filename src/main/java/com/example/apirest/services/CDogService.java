package com.example.apirest.services;

import com.example.apirest.models.CDog;
import com.example.apirest.repositories.IDogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CDogService {

    @Autowired
    IDogRepository iDogRepository;

    public ArrayList<CDog> getDogs(){
        return (ArrayList<CDog>) iDogRepository.findAll();
    }

    public CDog getDogById(int id){
        return iDogRepository.findById(id).orElse(null);
    }

    public CDog saveDog(CDog dogModel) {
        return iDogRepository.save(dogModel);
    }

}

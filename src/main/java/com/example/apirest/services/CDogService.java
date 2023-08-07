package com.example.apirest.services;

import com.example.apirest.models.CDog;
import com.example.apirest.repositories.IDogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CDogService {

    @Autowired
    IDogRepository iDogRepository;

    public ArrayList<CDog> getDogs(){
        return (ArrayList<CDog>) iDogRepository.findAll();
    }

    public Optional<CDog> getDogById(int id){
        try{
            return iDogRepository.findById(id);
        }
        catch(Exception error){
            return null ;
        }
    }

    public CDog postDog(CDog dogModel){
        try {
            iDogRepository.save(dogModel);
        } catch (Exception error) {
            return null;
        }
        return iDogRepository.save(dogModel);
    }

    public CDog updateDog(CDog dogModel, int id){
        try {
            Optional<CDog> existingDog = iDogRepository.findById(id);
            if (existingDog.isPresent()) {
                CDog update = existingDog.get();
                update.setName(dogModel.getName());
                update.setAge(dogModel.getAge());
                update.setType(dogModel.getType());
                update.setGender(dogModel.getGender());
                return iDogRepository.save(update);
            } else {
                throw new IllegalArgumentException("The ID doesn't exist");
            }
        } catch (Exception error) {
            return null;
        }
    }

    public String deleteDogById(int id){
        try{
            iDogRepository.deleteById(id);
            return "Deleted" + id;
        }
        catch(Exception error){
            return "Can not be deleted" + error;
        }
    }
}

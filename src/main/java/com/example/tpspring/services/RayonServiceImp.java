package com.example.tpspring.services;

import com.example.tpspring.entities.Rayon;
import com.example.tpspring.repositories.RayonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RayonServiceImp  implements RayonService{

    @Autowired
    RayonRepository rayonRepository;

    @Override
    public void addRayon(Rayon rayon) {
        if(!rayonRepository.findById(rayon.getIdRayon()).isPresent()){
            rayonRepository.save(rayon);
        }else{
            System.out.println("Rayon existe déja");
        }
    }

    @Override
    public String delete(long id) {
        rayonRepository.deleteById(id);

        return "rayon deleted";
    }

    @Override
    public String DeleteAllRayon() {
        rayonRepository.deleteAll();
        return "ok";
    }

    @Override
    public String updateRayon(long id) {
        return null;
    }


    @Override
    public Rayon getRayonById(long id) {
        return rayonRepository.findById(id).get();
    }

    @Override
    public List<Rayon> getAllRayon() {
        return rayonRepository.findAll();
    }
}

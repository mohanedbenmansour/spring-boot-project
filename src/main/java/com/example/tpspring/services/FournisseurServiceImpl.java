package com.example.tpspring.services;

import com.example.tpspring.entities.Fournisseur;
import com.example.tpspring.repositories.FourniseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class FournisseurServiceImpl implements FournisseurService{
    @Autowired
    FourniseurRepository fourniseurRepository;
    @Override
    public void addFournisseur(Fournisseur fournisseur) {
        if(!fourniseurRepository.findById(fournisseur.getIdFournisseur()).isPresent()){
            fourniseurRepository.save(fournisseur);
        }else{
            System.out.println("Fournisseur existe déja");
        }
    }

    @Override
    public Fournisseur getFournisseurById(long id) {
        return fourniseurRepository.findById(id).get();
    }

    @Override
    public void deleteFournisseur(Fournisseur fournisseur){
         fourniseurRepository.delete(fournisseur);
    }
    @Override
    public List<Fournisseur> getFournisseurs() {
        return fourniseurRepository.findAll();
    }
}

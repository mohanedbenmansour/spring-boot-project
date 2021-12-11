package com.example.tpspring.services;

import com.example.tpspring.entities.Produit;
import com.example.tpspring.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProduitServiceImpl implements ProduitService{

    @Autowired
    ProduitRepository produitRepository;
    @Override
    public void addProduit(Produit produit) {
        produitRepository.save(produit);


    }

    @Override
    public Produit getProduitById(long id) {
        return  produitRepository.findById(id).get();
    }
}

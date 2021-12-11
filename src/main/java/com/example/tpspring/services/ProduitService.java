package com.example.tpspring.services;

import com.example.tpspring.entities.Produit;

public interface ProduitService {
    public void addProduit(Produit produit);
    public Produit getProduitById(long id);

}

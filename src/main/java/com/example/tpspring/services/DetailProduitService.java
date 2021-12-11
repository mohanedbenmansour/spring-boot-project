package com.example.tpspring.services;

import com.example.tpspring.entities.DetailProduit;

public interface DetailProduitService {
    void addDetailProduit(DetailProduit detailProduit);
    DetailProduit getDetailProduitById(long id);
}

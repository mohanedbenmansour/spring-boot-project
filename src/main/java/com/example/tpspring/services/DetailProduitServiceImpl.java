package com.example.tpspring.services;

import com.example.tpspring.entities.DetailProduit;
import com.example.tpspring.repositories.DetailProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetailProduitServiceImpl implements DetailProduitService{
    @Autowired
    DetailProduitRepository detailProduitRepository;
    @Override
    public void addDetailProduit(DetailProduit detailProduit) {
        if(!detailProduitRepository.findById(detailProduit.getIdDetailProduit()).isPresent()){
            detailProduitRepository.save(detailProduit);
        }else{
            System.out.println("Detail Produit existe déja !!");
        }
    }

    @Override
    public DetailProduit getDetailProduitById(long id) {
        return detailProduitRepository.findById(id).get();
    }

}

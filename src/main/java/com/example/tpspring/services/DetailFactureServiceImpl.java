package com.example.tpspring.services;

import com.example.tpspring.entities.DetailFactures;
import com.example.tpspring.repositories.DetailFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetailFactureServiceImpl implements DetailFactureService{

    @Autowired
    DetailFactureRepository detailFactureRepository;


    @Override
    public void addDetailFacture(DetailFactures detailFacture) {
        if(!detailFactureRepository.findById(detailFacture.getIdDetailFacture()).isPresent()){
            detailFactureRepository.save(detailFacture);
        }else{
            System.out.println("Detail Facture Existe déja !!");
        }
    }

    @Override
    public DetailFactures getDetailFacture(long id) {
        return detailFactureRepository.findById(id).get();
    }
}

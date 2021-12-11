package com.example.tpspring.services;

import com.example.tpspring.entities.Facture;

import java.util.List;

public interface FactureService {

    void ajouterFacture(Facture factures);
    void supprimerFacture(long id);
    void supprimerToutLesFactures();
    void updatefacture(Facture facture , long id);
    List<Facture> chercherFacture();
    Facture cherchefactureid(long id);
}

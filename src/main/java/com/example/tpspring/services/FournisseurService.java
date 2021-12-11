package com.example.tpspring.services;

import com.example.tpspring.entities.Fournisseur;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FournisseurService {
    public void addFournisseur(Fournisseur fournisseur);
    public Fournisseur getFournisseurById(long id);
    public List<Fournisseur> getFournisseurs();
    public void deleteFournisseur(Fournisseur fournisseur);

}

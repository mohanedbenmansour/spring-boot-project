package com.example.tpspring.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailFactures {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idDetailFacture;
    private int qte;
    private float prixTotal;
    private int pourcentageRemise;
    private float montantRemise;
    @ManyToOne
    private Produit produit;
    @ManyToOne
    private Facture facture;

}

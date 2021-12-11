package com.example.tpspring.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProduit;

    private String code;
    private String libelle;
    private Float prixUnitaire;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Rayon rayon;
    @OneToMany(mappedBy = "produit")
    private  Set <DetailFactures> detailFactures;
    @OneToOne
    private DetailProduit detailProduit;
    @ManyToMany()
    private Set<Fournisseur> fournisseur;

}

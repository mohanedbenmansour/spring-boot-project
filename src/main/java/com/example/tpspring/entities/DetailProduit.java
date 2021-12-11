package com.example.tpspring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DetailProduit {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long IdDetailProduit;

    @Temporal (TemporalType.DATE)

    private Date dateCreation;
    @Temporal (TemporalType.DATE)

    private Date dateDerniereModification;
    @Enumerated(EnumType.STRING)

    @OneToOne
    private Produit produit;
}

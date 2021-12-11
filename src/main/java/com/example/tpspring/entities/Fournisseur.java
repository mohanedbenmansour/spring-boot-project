package com.example.tpspring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fournisseur {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idFournisseur;
    private String code;
    private String libelle;

}

package com.example.tpspring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String prenom;


    @Temporal (TemporalType.DATE)
    private Date dateNaissance;

    private String Email;
    private String password;
    @Enumerated(EnumType.STRING)
    private categorieClient categorieClient;
    @Enumerated(EnumType.STRING)
    private profession profession;

    @OneToMany(mappedBy = "client")
    private List<Facture> factures;
}

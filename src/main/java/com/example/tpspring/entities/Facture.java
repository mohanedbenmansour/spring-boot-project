package com.example.tpspring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Facture  {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idFacture;
    private float montantRemise;
    private float montantFacture;
    private Boolean active;
    @Temporal (TemporalType.DATE)
    private Date dateFacture;
    @ManyToOne
    private Client client;
    @OneToMany(mappedBy = "facture")
    private  Set <DetailFactures> detailFactures;






}

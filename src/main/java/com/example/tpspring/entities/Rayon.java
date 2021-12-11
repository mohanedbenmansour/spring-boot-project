package com.example.tpspring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rayon {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idRayon;
    private String code;
    private String libelle;
    @OneToMany(mappedBy = "rayon")
    private List<Produit> produit;
}

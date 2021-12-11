package com.example.tpspring.repositories;

import com.example.tpspring.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface FourniseurRepository extends JpaRepository<Fournisseur,Long> {

    @Query("select f from Fournisseur f where f.code= :code")
    Fournisseur getFournisseurByCode(String code);
 @Query("select count(f) from Fournisseur f")
    void getNombreDeFournisseur();
}

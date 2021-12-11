package com.example.tpspring.repositories;

import com.example.tpspring.entities.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitRepository extends JpaRepository<DetailProduit,Long> {
}

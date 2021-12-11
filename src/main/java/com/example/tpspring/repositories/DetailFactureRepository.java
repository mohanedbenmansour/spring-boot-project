package com.example.tpspring.repositories;

import com.example.tpspring.entities.DetailFactures;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository   extends JpaRepository<DetailFactures,Long> {
}

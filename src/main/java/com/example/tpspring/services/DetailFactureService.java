package com.example.tpspring.services;

import com.example.tpspring.entities.DetailFactures;
import org.springframework.stereotype.Service;

@Service
public interface DetailFactureService {
    void addDetailFacture(DetailFactures detailFacture);

    DetailFactures getDetailFacture(long id);
}

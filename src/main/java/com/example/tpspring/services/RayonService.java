package com.example.tpspring.services;

import com.example.tpspring.entities.Rayon;

import java.util.List;

public interface RayonService {

    public void addRayon(Rayon rayon);
    public String delete( long id);
    public String DeleteAllRayon();
    public String updateRayon( long id);
    public Rayon getRayonById(long id);
    public List<Rayon> getAllRayon();
}

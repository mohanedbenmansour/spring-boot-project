package com.example.tpspring.controller;


import com.example.tpspring.entities.Fournisseur;
import com.example.tpspring.services.FournisseurServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@Api(tags="controller fournisseur")

@RestController
@RequestMapping("/api/fournisseur")
public class FournisseurController {


    @Autowired
    private FournisseurServiceImpl founisseurService;
    @ApiOperation(value="recuperer les fournisseurs")

    // http://localhost:8089/SpringMVC/api/fournisseur/getAllFournisseur

    @GetMapping("/getAllFournisseur")
    public List<Fournisseur> getFounisseurs() {
        List<Fournisseur> listFournisseurs = founisseurService.getFournisseurs();
        return listFournisseurs;
    }

    // http://localhost:8089/SpringMVC/api/fournisseur/addClient
    @ApiOperation(value="ajouter un fournisseur")
    @PostMapping("/addFournisseur")
    public void addClient(@RequestBody Fournisseur f)
    {
        founisseurService.addFournisseur(f);

    }

    // http://localhost:8089/SpringMVC/api/fournisseur/getFournisseurById/{id}
    @ApiOperation(value="recuperer un fournisseur par id")

    @PostMapping("/getFournisseurById/{id}")
    public Fournisseur getFounisseurById(@PathVariable int id)
    {
        Fournisseur fournisseur=founisseurService.getFournisseurById(id);
        return  fournisseur;

    }

    // http://localhost:8089/SpringMVC/api/fournisseur/deleteFournisseur
    @ApiOperation(value="supprimer un fournisseur par id")

    @PostMapping("/deleteFournisseur")
    public void deleteFounisseur(@RequestBody Fournisseur f)
    {
       founisseurService.deleteFournisseur(f);


    }


    @Scheduled(cron="* * * * * *")
    public void testCron(){
      //  founisseurService.getNombreDeFournisseur();


    }



}

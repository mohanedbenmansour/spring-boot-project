package com.example.tpspring.controller;

import com.example.tpspring.entities.DetailFactures;
import com.example.tpspring.entities.Fournisseur;
import com.example.tpspring.services.DetailFactureServiceImpl;
import com.example.tpspring.services.FournisseurServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@Api(value = "API to search Student from a Student Repository by different search parameters",description = "This API provides the capability to search Student from a Student Repository", produces = "application/json")
@RestController
@RequestMapping("/api/detailFacture")
public class DetailFactureController {


    @Autowired
    private DetailFactureServiceImpl detailFactureService;

    // http://localhost:8089/SpringMVC/api/detailFacture/getAllDetailFactures
    @ApiOperation(value="recuperer les detail factures")
    @GetMapping("/getAllDetailFactures")
    public DetailFactures getDetailFactureById(@PathVariable int id) {
        DetailFactures detailFacture = detailFactureService.getDetailFacture(id);
        return detailFacture;
    }
    @ApiOperation(value="ajouter les detail factures")

    // http://localhost:8089/SpringMVC/api/detailFacture/addDetailFacture
    @PostMapping("/addDetailFacture")
    public void addDetailFacture(@RequestBody DetailFactures detailFacture) {
        detailFactureService.addDetailFacture(detailFacture);


    }

   /* @Scheduled(cron="* * * * * *")
    public void testCron(){
        System.out.println("test");
    }*/

}
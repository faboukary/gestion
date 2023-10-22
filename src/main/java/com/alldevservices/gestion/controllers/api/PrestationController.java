package com.alldevservices.gestion.controllers.api;

import com.alldevservices.gestion.dao.entities.Prestation;
import com.alldevservices.gestion.services.GestionServicesImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PrestationController {
    @Autowired
    private GestionServicesImplementation gestionServicesImplementation;
    @GetMapping("/prestations")
    public ResponseEntity<List<Prestation>> findAll(){
        List<Prestation> liste = gestionServicesImplementation.findAllPrestations();
        return new ResponseEntity<List<Prestation>>(liste, HttpStatus.OK);
    }
    @GetMapping("/prestation/{IdPrestation}")
    public ResponseEntity<Prestation> findPrestationById(@PathVariable Long IdPrestation){
        Prestation prestation = gestionServicesImplementation.findPrestationById(IdPrestation);
        return new ResponseEntity<Prestation>(prestation, HttpStatus.OK);
    }
    @PostMapping("/prestation/addNew")
    public ResponseEntity<Prestation> addPrestation(@RequestBody Prestation prestation){
        Prestation prt = gestionServicesImplementation.addPrestation(prestation);
        return new ResponseEntity<Prestation>(prt, HttpStatus.OK);
    }

    @PutMapping("/prestation/{Id}/edit")
    public ResponseEntity<Prestation> updatePrestation(@PathVariable Long Id, @RequestBody Prestation prestation){
        Prestation p1 = gestionServicesImplementation.findPrestationById(Id);
        p1.setLibelle(prestation.getLibelle());
        p1.setDescription(prestation.getDescription());
        Prestation p2 = gestionServicesImplementation.addPrestation(p1);
        return new ResponseEntity<Prestation>(p2, HttpStatus.OK);
    }

    @DeleteMapping("/prestation/{IdPresta}/delete")
    public void deletePrestation(@PathVariable Long IdPresta){
        Prestation presta = gestionServicesImplementation.findPrestationById(IdPresta);
        gestionServicesImplementation.deletePrestation(presta);
    }

}

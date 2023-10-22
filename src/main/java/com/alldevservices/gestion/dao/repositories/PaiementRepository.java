package com.alldevservices.gestion.dao.repositories;

import com.alldevservices.gestion.dao.entities.Commande;
import com.alldevservices.gestion.dao.entities.Facture;
import com.alldevservices.gestion.dao.entities.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PaiementRepository  extends JpaRepository<Paiement, Long> {
    Paiement findPaiementById(Long id);
   // @Query("SELECT p FROM Paiement WHERE p.facture = :facture")
   // List<Paiement> findPaiementByFacture(@Param("facture") Facture facture);
    List<Paiement> findPaiementByFacture(Facture facture);

}

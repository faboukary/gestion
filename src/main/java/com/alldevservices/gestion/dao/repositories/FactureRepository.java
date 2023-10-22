package com.alldevservices.gestion.dao.repositories;

import com.alldevservices.gestion.dao.entities.Commande;
import com.alldevservices.gestion.dao.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Long>  {
    Facture findFactureById(Long id);
    List<Facture> findFactureByDateFacture(Date dateFacture);
   // @Query("SELECT f FROM Facture WHERE f.commande = :commande")
    //List<Facture> findFactureByCommande(@Param("commande")Commande commande);
    List<Facture> findFactureByCommande(Commande commande);
}

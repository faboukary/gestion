package com.alldevservices.gestion.dao.repositories;

import com.alldevservices.gestion.dao.entities.Client;
import com.alldevservices.gestion.dao.entities.Commande;
import com.alldevservices.gestion.dao.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    Commande findCommandeById(Long id);
    List<Commande> findCommandeByDate(Date date);
    // @Query("SELECT c FROM Commande WHERE u.client = :client")
    //List<Commande> findCommandeByClient(@Param("client") Client client);
    List<Commande> findCommandeByClient(Client client);

   // @Query("SELECT c FROM Commande WHERE u.prestation = :prestation")
    // <Commande> findCommandeByPrestation(@Param("prestation") Prestation prestation);
    List<Commande> findCommandeByPrestation(Prestation prestation);
}

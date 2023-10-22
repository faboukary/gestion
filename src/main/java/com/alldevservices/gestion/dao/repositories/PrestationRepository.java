package com.alldevservices.gestion.dao.repositories;

import com.alldevservices.gestion.dao.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrestationRepository extends JpaRepository<Prestation, Long> {
    Prestation findPrestationById(Long id);
    List<Prestation> findPrestationByLibelle(String libelle);
}

package com.alldevservices.gestion.dao.repositories;

import com.alldevservices.gestion.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientById(Long id);
    List<Client> findClientByNom(String nom);
    List<Client> findClientByEmail(String email);
    List<Client> findClientByStatutJuridique(String statutJuridique);

}

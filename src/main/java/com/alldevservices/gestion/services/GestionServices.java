package com.alldevservices.gestion.services;

import com.alldevservices.gestion.dao.entities.*;

import java.util.Date;
import java.util.List;

public interface GestionServices {
    // Services pour Clients
    List<Client> findAllClients();
    Client findClientById(Long id);
    List<Client> findClientByNom(String nom);
    List<Client> findClientByEmail(String email);
    List<Client> findClientByStatutJuridique(String statutJuridique);
    Client updateClient(Client client);
    Client addClient(Client client);
    void deleteClient(Client client);

    // Services pour Commandes
    List<Commande> findAllCommandes();
    Commande findCommandeById(Long id);
    List<Commande> findCommandeByDate(Date date);
    List<Commande> findCommandeByClient(Client client);
    List<Commande> findCommandeByPrestation(Prestation prestation);
    Commande updateCommande(Commande commande);
    Commande addCommande(Commande commande);
    void deleteCommande(Commande commande);

    // Services pour Factures
    List<Facture> findAllFactures();
    Facture findFactureById(Long id);
    List<Facture> findFactureByDateFacture(Date dateFacture);
    List<Facture> findFactureByCommande(Commande commande);
    Facture updateFacture(Facture facture);
    Facture addFacture(Facture facture);
    void deleteFacture(Facture facture);

    // Services pour Paiements
    List<Paiement> findAllPaiements();
    Paiement findPaiementById(Long id);
    List<Paiement> findPaiementByFacture(Facture facture);
    Paiement updatePaiement(Paiement paiement);
    Paiement addPaiement(Paiement paiement);
    void deletePaiement(Paiement paiement);

    // Services pour Prestations
    List<Prestation> findAllPrestations();
    Prestation findPrestationById(Long id);
    List<Prestation> findPrestationByLibelle(String libelle);
    Prestation updatePrestation(Prestation prestation);
    Prestation addPrestation(Prestation prestation);
    void deletePrestation(Prestation prestation);


}

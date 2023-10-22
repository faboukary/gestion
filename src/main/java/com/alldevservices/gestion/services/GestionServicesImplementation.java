package com.alldevservices.gestion.services;

import com.alldevservices.gestion.dao.entities.*;
import com.alldevservices.gestion.dao.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class GestionServicesImplementation implements GestionServices {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CommandeRepository commandeRepository;
    @Autowired
    private FactureRepository factureRepository;
    @Autowired
    private PaiementRepository paiementRepository;
    @Autowired
    private PrestationRepository prestationRepository;

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client findClientById(Long id) {
        return clientRepository.findClientById(id);
    }

    @Override
    public List<Client> findClientByNom(String nom) {
        return clientRepository.findClientByNom(nom);
    }

    @Override
    public List<Client> findClientByEmail(String email) {
        return clientRepository.findClientByEmail(email);
    }

    @Override
    public List<Client> findClientByStatutJuridique(String statutJuridique) {
        return clientRepository.findClientByStatutJuridique(statutJuridique);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public List<Commande> findAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande findCommandeById(Long id) {
        return commandeRepository.findCommandeById(id);
    }

    @Override
    public List<Commande> findCommandeByDate(Date date) {
        return commandeRepository.findCommandeByDate(date);
    }

    @Override
    public List<Commande> findCommandeByClient(Client client) {
        return commandeRepository.findCommandeByClient(client);
    }

    @Override
    public List<Commande> findCommandeByPrestation(Prestation prestation) {
        return commandeRepository.findCommandeByPrestation(prestation);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }

    @Override
    public List<Facture> findAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public Facture findFactureById(Long id) {
        return factureRepository.findFactureById(id);
    }

    @Override
    public List<Facture> findFactureByDateFacture(Date dateFacture) {
        return factureRepository.findFactureByDateFacture(dateFacture);
    }

    @Override
    public List<Facture> findFactureByCommande(Commande commande) {
        return factureRepository.findFactureByCommande(commande);
    }

    @Override
    public Facture updateFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public Facture addFacture(Facture facture) {
        return factureRepository.save(facture);
    }

    @Override
    public void deleteFacture(Facture facture) {
        factureRepository.delete(facture);
    }

    @Override
    public List<Paiement> findAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement findPaiementById(Long id) {
        return paiementRepository.findPaiementById(id);
    }

    @Override
    public List<Paiement> findPaiementByFacture(Facture facture) {
        return paiementRepository.findPaiementByFacture(facture);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Paiement paiement) {
        paiementRepository.delete(paiement);
    }

    @Override
    public List<Prestation> findAllPrestations() {
        return prestationRepository.findAll();
    }

    @Override
    public Prestation findPrestationById(Long id) {
        return prestationRepository.findPrestationById(id);
    }

    @Override
    public List<Prestation> findPrestationByLibelle(String libelle) {
        return prestationRepository.findPrestationByLibelle(libelle);
    }

    @Override
    public Prestation updatePrestation(Prestation prestation) {
        return prestationRepository.save(prestation);
    }

    @Override
    public Prestation addPrestation(Prestation prestation) {
        return prestationRepository.save(prestation);
    }

    @Override
    public void deletePrestation(Prestation prestation) {
        prestationRepository.delete(prestation);
    }
}

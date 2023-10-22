package com.alldevservices.gestion.dao.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "commandes")
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private Long quantite;
    @Column(nullable = false)
    private Number prixUnitaire;
    @Column(nullable = false)
    private Number montant;
    @Column(nullable = false)
    private Date  date;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private Prestation prestation;

    @OneToOne(fetch = FetchType.LAZY)
    private Facture facture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public Number getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Number prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Number getMontant() {
        return montant;
    }

    public void setMontant(Number montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Prestation getService() {
        return prestation;
    }

    public void setService(Prestation prestation) {
        this.prestation = prestation;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Commande)) return false;
        Commande commande = (Commande) o;
        return Objects.equals(getId(), commande.getId()) && Objects.equals(getQuantite(), commande.getQuantite()) && Objects.equals(getPrixUnitaire(), commande.getPrixUnitaire()) && Objects.equals(getMontant(), commande.getMontant()) && Objects.equals(getDate(), commande.getDate()) && Objects.equals(getClient(), commande.getClient()) && Objects.equals(getService(), commande.getService()) && Objects.equals(getFacture(), commande.getFacture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getQuantite(), getPrixUnitaire(), getMontant(), getDate(), getClient(), getService(), getFacture());
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", prixUnitaire=" + prixUnitaire +
                ", montant=" + montant +
                ", date=" + date +
                ", client=" + client +
                ", prestation=" + prestation +
                ", facture=" + facture +
                '}';
    }
}

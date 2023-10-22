package com.alldevservices.gestion.dao.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "factures")
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private Number montantPaye;
    @Column(nullable = false)
    private Number montantRestant;
    @Column(nullable = false)
    private Date dateFacture;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "commande_id", referencedColumnName = "id")
    private Commande commande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(Number montantPaye) {
        this.montantPaye = montantPaye;
    }

    public Number getMontantRestant() {
        return montantRestant;
    }

    public void setMontantRestant(Number montantRestant) {
        this.montantRestant = montantRestant;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", montantPaye=" + montantPaye +
                ", montantRestant=" + montantRestant +
                ", dateFacture=" + dateFacture +
                ", commande=" + commande +
                '}';
    }
}

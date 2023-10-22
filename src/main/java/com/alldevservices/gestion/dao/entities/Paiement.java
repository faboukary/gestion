package com.alldevservices.gestion.dao.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "paiements")
public class Paiement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private Number montantPaye;
    @Column(nullable = false)
    private Date datePaiement;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facture_id")
    private Facture facture;

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

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
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
        if (!(o instanceof Paiement)) return false;
        Paiement paiement = (Paiement) o;
        return Objects.equals(getId(), paiement.getId()) && Objects.equals(getMontantPaye(), paiement.getMontantPaye()) && Objects.equals(getDatePaiement(), paiement.getDatePaiement()) && Objects.equals(getFacture(), paiement.getFacture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMontantPaye(), getDatePaiement(), getFacture());
    }

    @Override
    public String toString() {
        return "Paiement{" +
                "id=" + id +
                ", montantPaye=" + montantPaye +
                ", datePaiement=" + datePaiement +
                ", facture=" + facture +
                '}';
    }
}

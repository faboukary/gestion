package com.alldevservices.gestion.dao.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 250, unique = true)
    private String nom;
    @Column(length = 250, unique = true)
    private String rccm;

    @Column(length = 250, unique = true)
    private String nif;
    @Column(length = 250, nullable = false)
    private String activitePrincipale;
    @Column(length = 250, nullable = true)
    private String activiteSecondaire;
    @Column(length = 25)
    private String bp;
    @Column(length = 250, unique = true)
    private String email;
    @Column(length = 150)
    private String statutJuridique;
    @Column(length = 100, unique = true)
    private String phoneNumber;
    @Column(length = 250, unique = true)
    private String adresseBureau;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRccm() {
        return rccm;
    }

    public void setRccm(String rccm) {
        this.rccm = rccm;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getActivitePrincipale() {
        return activitePrincipale;
    }

    public void setActivitePrincipale(String activitePrincipale) {
        this.activitePrincipale = activitePrincipale;
    }

    public String getActiviteSecondaire() {
        return activiteSecondaire;
    }

    public void setActiviteSecondaire(String activiteSecondaire) {
        this.activiteSecondaire = activiteSecondaire;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatutJuridique() {
        return statutJuridique;
    }

    public void setStatutJuridique(String statutJuridique) {
        this.statutJuridique = statutJuridique;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdresseBureau() {
        return adresseBureau;
    }

    public void setAdresseBureau(String adresseBureau) {
        this.adresseBureau = adresseBureau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getId(), client.getId()) && Objects.equals(getNom(), client.getNom()) && Objects.equals(getRccm(), client.getRccm()) && Objects.equals(getNif(), client.getNif()) && Objects.equals(getActivitePrincipale(), client.getActivitePrincipale()) && Objects.equals(getActiviteSecondaire(), client.getActiviteSecondaire()) && Objects.equals(getBp(), client.getBp()) && Objects.equals(getEmail(), client.getEmail()) && Objects.equals(getStatutJuridique(), client.getStatutJuridique()) && Objects.equals(getPhoneNumber(), client.getPhoneNumber()) && Objects.equals(getAdresseBureau(), client.getAdresseBureau());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getRccm(), getNif(), getActivitePrincipale(), getActiviteSecondaire(), getBp(), getEmail(), getStatutJuridique(), getPhoneNumber(), getAdresseBureau());
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", rccm='" + rccm + '\'' +
                ", nif='" + nif + '\'' +
                ", activitePrincipale='" + activitePrincipale + '\'' +
                ", activiteSecondaire='" + activiteSecondaire + '\'' +
                ", bp='" + bp + '\'' +
                ", email='" + email + '\'' +
                ", statutJuridique='" + statutJuridique + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adresseBureau='" + adresseBureau + '\'' +
                '}';
    }
}

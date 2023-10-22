package com.alldevservices.gestion.dao.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "prestations")
public class Prestation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 250, unique = false)
    private String libelle;
    @Column(length = 250, nullable = true)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Prestation)) return false;
        Prestation prestation = (Prestation) o;
        return Objects.equals(getId(), prestation.getId()) && Objects.equals(getLibelle(), prestation.getLibelle()) && Objects.equals(getDescription(), prestation.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLibelle(), getDescription());
    }

    @Override
    public String toString() {
        return "Prestation{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

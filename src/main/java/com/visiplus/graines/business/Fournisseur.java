package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(length = 255)
    private String nom;

    @NotBlank
    @Pattern(regexp = "^0[67]\\d{8}$")
    @Column(length = 10)
    private String numeroPortable;

    public Fournisseur() {
    }

    public Fournisseur(Long id, String nom, String numeroPortable) {
        this.id = id;
        this.nom = nom;
        this.numeroPortable = numeroPortable;
    }

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

    public String getNumeroPortable() {
        return numeroPortable;
    }

    public void setNumeroPortable(String numeroPortable) {
        this.numeroPortable = numeroPortable;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", numeroPortable='" + numeroPortable + '\'' +
                '}';
    }
}

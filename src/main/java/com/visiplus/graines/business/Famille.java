package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

@Entity
public class Famille {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, length = 100)
    private String nom;

    @Column(nullable = false)
    @Size(min = 6, max = 6)
    private String couleurRGB;

    public Famille() {
    }
    public Famille(Long id, String nom, String couleurRGB) {
        this.id = id;
        this.nom = nom;
        this.couleurRGB = couleurRGB;
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

    public String getCouleurRGB() {
        return couleurRGB;
    }

    public void setCouleurRGB(String couleurRGB) {
        this.couleurRGB = couleurRGB;
    }

    @Override
    public String toString() {
        return "Famille{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", couleurRGB='" + couleurRGB + '\'' +
                '}';
    }
}

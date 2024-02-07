package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class TypeDeGraine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nom;

    @Column(length = 100, nullable = false)
    @Size(min = 1, max = 100)

    private String description;

    @Column(nullable = false)

    @Min(1)
    @Max(52)
    private int semaineDePlantationMin;

    @Column(nullable = false)

    @Min(1)
    @Max(52)
    private int semaineDePlantationMax;

    @Column(nullable = false)

    private float espaceEntrePiedsEnCentimetres;

    @Column(nullable = false)

    private float espaceEntreLignesEnCentimetres;

    @Size(min = 40)
    private String conseils;

    @ManyToOne(optional = false)
    private Famille famille;

    public TypeDeGraine() {
    }

    public TypeDeGraine(Long id, String nom, String description, int semaineDePlantationMin, int semaineDePlantationMax, float espaceEntrePiedsEnCentimetres, float espaceEntreLignesEnCentimetres, String conseils, Famille famille) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.semaineDePlantationMin = semaineDePlantationMin;
        this.semaineDePlantationMax = semaineDePlantationMax;
        this.espaceEntrePiedsEnCentimetres = espaceEntrePiedsEnCentimetres;
        this.espaceEntreLignesEnCentimetres = espaceEntreLignesEnCentimetres;
        this.conseils = conseils;
        this.famille = famille;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSemaineDePlantationMin() {
        return semaineDePlantationMin;
    }

    public void setSemaineDePlantationMin(int semaineDePlantationMin) {
        this.semaineDePlantationMin = semaineDePlantationMin;
    }

    public int getSemaineDePlantationMax() {
        return semaineDePlantationMax;
    }

    public void setSemaineDePlantationMax(int semaineDePlantationMax) {
        this.semaineDePlantationMax = semaineDePlantationMax;
    }

    public float getEspaceEntrePiedsEnCentimetres() {
        return espaceEntrePiedsEnCentimetres;
    }

    public void setEspaceEntrePiedsEnCentimetres(float espaceEntrePiedsEnCentimetres) {
        this.espaceEntrePiedsEnCentimetres = espaceEntrePiedsEnCentimetres;
    }

    public float getEspaceEntreLignesEnCentimetres() {
        return espaceEntreLignesEnCentimetres;
    }

    public void setEspaceEntreLignesEnCentimetres(float espaceEntreLignesEnCentimetres) {
        this.espaceEntreLignesEnCentimetres = espaceEntreLignesEnCentimetres;
    }

    public String getConseils() {
        return conseils;
    }

    public void setConseils(String conseils) {
        this.conseils = conseils;
    }

    public Famille getFamille() {
        return famille;
    }

    public void setFamille(Famille famille) {
        this.famille = famille;
    }

    @Override
    public String toString() {
        return "TypeDeGraine{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", semaineDePlantationMin=" + semaineDePlantationMin +
                ", semaineDePlantationMax=" + semaineDePlantationMax +
                ", espaceEntrePiedsEnCentimetres=" + espaceEntrePiedsEnCentimetres +
                ", espaceEntreLignesEnCentimetres=" + espaceEntreLignesEnCentimetres +
                ", conseils='" + conseils + '\'' +
                ", famille=" + famille +
                '}';
    }
}

package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class TypeDeGraine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    @Size(min = 1, max = 100)
    @NotNull
    private String nom;

    @Column(nullable = false)
    @NotNull
    private int semaineDePlantationMin;

    @Column(nullable = false)
    @NotNull
    private int semaineDePlantationMax;

    @Column(nullable = false)
    @NotNull
    private float espaceEntrePlantesEnCentimetres;

    public TypeDeGraine(Long id, String nom, int semaineDePlantationMin, int semaineDePlantationMax, float espaceEntrePlantesEnCentimetres) {
        this.id = id;
        this.nom = nom;
        this.semaineDePlantationMin = semaineDePlantationMin;
        this.semaineDePlantationMax = semaineDePlantationMax;
        this.espaceEntrePlantesEnCentimetres = espaceEntrePlantesEnCentimetres;
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

    public float getEspaceEntrePlantesEnCentimetres() {
        return espaceEntrePlantesEnCentimetres;
    }

    public void setEspaceEntrePlantesEnCentimetres(float espaceEntrePlantesEnCentimetres) {
        this.espaceEntrePlantesEnCentimetres = espaceEntrePlantesEnCentimetres;
    }

    @Override
    public String toString() {
        return "TypeDeGraine{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", semaineDePlantationMin=" + semaineDePlantationMin +
                ", semaineDePlantationMax=" + semaineDePlantationMax +
                ", espaceEntrePlantesEnCentimetres=" + espaceEntrePlantesEnCentimetres +
                '}';
    }
}

package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Recette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank
    @Size(max = 100)
    private String nom;

    @Column(nullable = false, length = 10000)
    @NotBlank(message = "L'intitulé est obligatoire")
    @Size(max = 10000)
    private String intitule;

    @Column(nullable = false, length = 10000)
    @NotBlank
    @Size(max = 10000)
    private String contenu;

    @ManyToMany
    private Set<TypeDeGraine> typesDeGraine;

    public Recette() {
    }

    public Recette(Long id, String nom, String intitule, String contenu, Set<TypeDeGraine> typesDeGraine) {
        this.id = id;
        this.nom = nom;
        this.intitule = intitule;
        this.contenu = contenu;
        this.typesDeGraine = typesDeGraine;
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

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Set<TypeDeGraine> getTypesDeGraine() {
        return typesDeGraine;
    }

    public void setTypesDeGraine(Set<TypeDeGraine> typesDeGraine) {
        this.typesDeGraine = typesDeGraine;
    }

    @Override
    public String toString() {
        return "Recette{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", intitule='" + intitule + '\'' +
                ", contenu='" + contenu + '\'' +
                ", typesDeGraine=" + typesDeGraine +
                '}';
    }
}
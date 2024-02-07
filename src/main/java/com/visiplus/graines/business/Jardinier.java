package com.visiplus.graines.business;

import javax.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
public class Jardinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Le nom ne peut pas être vide")
    @Size(max = 100)
    private String nom;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Le nom ne peut pas être vide")
    @Size(max = 100)
    private String prenom;

    @Column
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate dateNaissance;

    @OneToMany(mappedBy = "jardinier")
    private Set<Commande> commandes;

    public Jardinier() {
    }

    public Jardinier(Long id, String nom, String prenom, LocalDate dateNaissance, Set<Commande> commandes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.commandes = commandes;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Set<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Jardinier{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", commandes=" + commandes +
                '}';
    }
}
package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Sachet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1, message = "Le poids en grammes doit être positif")
    private int poidsEnGrammes;

    @NotNull(message = "Le prix en euros est requis")
    private BigDecimal prixEnEuros;

    @Column(nullable = false)
    @NotNull(message = "Le nom est requis")
    private String nom;

    public Sachet() {
    }

    public Sachet(int poidsEnGrammes, BigDecimal prixEnEuros, String nom) {
        this.poidsEnGrammes = poidsEnGrammes;
        this.prixEnEuros = prixEnEuros;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPoidsEnGrammes() {
        return poidsEnGrammes;
    }

    public void setPoidsEnGrammes(int poidsEnGrammes) {
        this.poidsEnGrammes = poidsEnGrammes;
    }

    public BigDecimal getPrixEnEuros() {
        return prixEnEuros;
    }

    public void setPrixEnEuros(BigDecimal prixEnEuros) {
        this.prixEnEuros = prixEnEuros;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Sachet{" +
                "id=" + id +
                ", poidsEnGrammes=" + poidsEnGrammes +
                ", prixEnEuros=" + prixEnEuros +
                ", nom='" + nom + '\'' +
                '}';
    }
}
package com.visiplus.graines.business;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantite;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private Sachet sachet;

    public LigneCommande() {
    }

    public LigneCommande(Long id, int quantite, Commande commande, Sachet sachet) {
        this.id = id;
        this.quantite = quantite;
        this.commande = commande;
        this.sachet = sachet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite= quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Sachet getSachet() {
        return sachet;
    }

    public void setSachet(Sachet sachet) {
        this.sachet = sachet;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", quantité=" + quantite +
                ", commande=" + commande +
                ", sachet=" + sachet +
                '}';
    }
}
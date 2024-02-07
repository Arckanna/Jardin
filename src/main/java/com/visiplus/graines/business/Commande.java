package com.visiplus.graines.business;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateHeureDeLenvoi;

    @OneToMany(mappedBy = "commande")
    @NotEmpty(message = "La commande doit avoir au moins une ligne de commande")
    private List<LigneCommande> lignesCommande;

    public BigDecimal getMontantTotal() {
        BigDecimal montantTotal = BigDecimal.ZERO;
        for (LigneCommande ligne : lignesCommande) {
            BigDecimal prixLigne = ligne.getSachet().getPrixEnEuros().multiply(new BigDecimal(ligne.getQuantite()));
            montantTotal = montantTotal.add(prixLigne);
        }
        return montantTotal;
    }
    @ManyToOne
    private Jardinier jardinier;

    public Commande() {
    }

    public Commande(Long id, LocalDateTime dateHeureDeLenvoi, List<LigneCommande> lignesCommande, Jardinier jardinier) {
        this.id = id;
        this.dateHeureDeLenvoi = dateHeureDeLenvoi;
        this.lignesCommande = lignesCommande;
        this.jardinier = jardinier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeureDeLenvoi() {
        return dateHeureDeLenvoi;
    }

    public void setDateHeureDeLenvoi(LocalDateTime dateHeureDeLenvoi) {
        this.dateHeureDeLenvoi = dateHeureDeLenvoi;
    }

    public List<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(List<LigneCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }

    public Jardinier getJardinier() {
        return jardinier;
    }

    public void setJardinier(Jardinier jardinier) {
        this.jardinier = jardinier;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateHeureDeLenvoi=" + dateHeureDeLenvoi +
                ", lignesCommande=" + lignesCommande +
                ", jardinier=" + jardinier +
                '}';
    }
}
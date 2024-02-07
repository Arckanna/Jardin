package com.visiplus.graines.business;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateHeureDeLenvoi;

    public Commande(Long id, LocalDateTime dateHeureDeLenvoi) {
        this.id = id;
        this.dateHeureDeLenvoi = dateHeureDeLenvoi;
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

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateHeureDeLenvoi=" + dateHeureDeLenvoi +
                '}';
    }
}

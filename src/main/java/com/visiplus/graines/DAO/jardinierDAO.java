package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Jardinier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface jardinierDAO extends JpaRepository<Jardinier, Long> {
    @Query("SELECT j FROM Jardinier j WHERE j.id IN (SELECT c.jardinier.id FROM Commande c JOIN c.lignesCommande l WHERE l.sachet.nom = 'basilic')")
    List<Jardinier> findJardiniersWhoOrderedBasil();
    @Query("SELECT j FROM Jardinier j ORDER BY SIZE(j.commandes) DESC")
    List<Jardinier> findJardiniersSortedByNumberOfOrders();
    @Query("SELECT j FROM Jardinier j WHERE j.dateNaissance <= :dateLimit")
    List<Jardinier> findJardiniersOlderThan(String dateLimit);
}
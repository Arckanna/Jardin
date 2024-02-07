package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Sachet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface sachetDAO extends JpaRepository<Sachet, Long> {
    @Query("SELECT s FROM Sachet s WHERE s.id NOT IN (SELECT l.sachet.id FROM LigneCommande l)")
    List<Sachet> findSachetsNeverOrdered();
    @Query("SELECT l.sachet, SUM(l.quantite) as total FROM LigneCommande l GROUP BY l.sachet ORDER BY total DESC")
    List<Object[]> findSachetsSortedByQuantityOrdered();

}

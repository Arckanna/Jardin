package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    List<Commande> findByDateHeureDeLenvoiBetween(LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT MONTH(c.dateHeureDeLenvoi) as month, COUNT(c) as count FROM Commande c GROUP BY month")
    List<Object[]> findNumberOfOrdersPerMonth();
}

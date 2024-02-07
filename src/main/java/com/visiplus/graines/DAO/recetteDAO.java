package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface recetteDAO extends JpaRepository<Recette, Long> {
    @Query("SELECT r FROM Recette r ORDER BY SIZE(r.typesDeGraine) DESC")
    List<Recette> findRecettesSortedByNumberOfGraineTypes();
}

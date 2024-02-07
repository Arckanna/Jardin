package com.visiplus.graines.DAO;
import com.visiplus.graines.business.TypeDeGraine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface typeDeGraineDAO extends JpaRepository<TypeDeGraine, Long> {
    @Query("SELECT g FROM TypeDeGraine g WHERE :currentWeek BETWEEN g.semaineDePlantationMin AND g.semaineDePlantationMax")
    List<TypeDeGraine> findGrainesToPlantThisWeek(int currentWeek);
}

package com.visiplus.graines.DAO;

import com.visiplus.graines.business.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ligneCommandDAO extends JpaRepository<LigneCommande, Long>{

}

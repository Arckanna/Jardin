package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    default Utilisateur findByEmail(String email) {
        return null;
    }
}

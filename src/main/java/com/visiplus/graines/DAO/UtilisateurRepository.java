package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    Utilisateur findByEmail(String email);
}

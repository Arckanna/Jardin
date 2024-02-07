package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilleRepository extends JpaRepository<Famille, Long> {
}

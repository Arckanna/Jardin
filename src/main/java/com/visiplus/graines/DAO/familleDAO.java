package com.visiplus.graines.DAO;

import com.visiplus.graines.business.Famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface familleDAO extends JpaRepository<Famille, Long> {
}

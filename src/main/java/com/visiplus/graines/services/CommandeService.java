package com.visiplus.graines.services;

import com.visiplus.graines.business.Commande;
import com.visiplus.graines.DAO.commandeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeService {

    @Autowired
    private commandeDAO commandeDao;

    public List<Commande> findCommandesSortedByTotalAmount() {
        List<Commande> commandes = commandeDao.findAll();
        return commandes.stream()
                .sorted(Comparator.comparing(Commande::getMontantTotal).reversed())
                .collect(Collectors.toList());
    }
}
package com.visiplus.graines.services;

import com.visiplus.graines.business.Commande;
import com.visiplus.graines.DAO.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> findCommandesSortedByTotalAmount() {
        List<Commande> commandes = commandeRepository.findAll();
        return commandes.stream()
                .sorted(Comparator.comparing(Commande::getMontantTotal).reversed())
                .collect(Collectors.toList());
    }
}
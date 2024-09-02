package com.programmingtechie.commandeservice.repository;

import com.programmingtechie.commandeservice.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}

package com.tpexam.client.repository;

import com.programmingtechie.commandeservice.model.Client;
import com.programmingtechie.commandeservice.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

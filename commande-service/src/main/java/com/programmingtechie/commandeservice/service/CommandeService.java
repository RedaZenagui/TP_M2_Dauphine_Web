package com.programmingtechie.commandeservice.service;

import com.programmingtechie.commandeservice.client.InventaireClient;
import com.programmingtechie.commandeservice.dto.CommandeRequest;
import com.programmingtechie.commandeservice.model.Commande;
import com.programmingtechie.commandeservice.repository.CommandeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class CommandeService {

    private final CommandeRepository commandeRepository;

    private final InventaireClient inventaireClient;

    public void placeCommande(CommandeRequest commandeRequest) {
       var isProduitInStock = inventaireClient.isInStock(commandeRequest.skuCode(), commandeRequest.quantity());
       if(isProduitInStock) {
           Commande commande = new Commande();
           commande.setCommandeNumber(UUID.randomUUID().toString());
           commande.setPrice(commandeRequest.price());
           commande.setQuantity(commandeRequest.quantity());
           commande.setSkuCode(commandeRequest.skuCode());

           commandeRepository.save(commande);
       } else {
           throw new RuntimeException("Produit is out of stock");
       }

    }

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }
    private static Commande mapToCommande(CommandeRequest commandeRequest) {
        Commande commande = new Commande();
        commande.setCommandeNumber(UUID.randomUUID().toString());
        commande.setPrice(commandeRequest.price());
        commande.setQuantity(commandeRequest.quantity());
        commande.setSkuCode(commandeRequest.skuCode());
        return commande;
    }
}

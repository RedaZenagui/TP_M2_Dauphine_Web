package com.programmingtechie.produitservice.service;

import com.programmingtechie.produitservice.dto.ProduitRequest;
import com.programmingtechie.produitservice.dto.ProduitResponse;
import com.programmingtechie.produitservice.model.Produit;
import com.programmingtechie.produitservice.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProduitService {

    private final ProduitRepository produitRepository;

    public void createProduit(ProduitRequest produitRequest) {
        Produit produit = Produit.builder()
                .name(produitRequest.name())
                .description(produitRequest.description())
                .price(produitRequest.price())
                .build();

        produitRepository.save(produit);
        log.info("Produit {} is saved", produit.getId());
    }

    public List<ProduitResponse> getAllProduits() {
        List<Produit> produits = produitRepository.findAll();

        return produits.stream().map(this::mapToProduitResponse).toList();
    }

    private ProduitResponse mapToProduitResponse(Produit produit) {
        return new ProduitResponse(produit.getId(), produit.getName(),
                produit.getDescription(), produit.getPrice());
    }
}

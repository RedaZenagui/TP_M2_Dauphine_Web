package com.programmingtechie.produitservice.controller;

import com.programmingtechie.produitservice.dto.ProduitRequest;
import com.programmingtechie.produitservice.dto.ProduitResponse;
import com.programmingtechie.produitservice.service.ProduitService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduit(@RequestBody ProduitRequest produitRequest) {
        produitService.createProduit(produitRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProduitResponse> getAllProduits() {
        return produitService.getAllProduits();
    }

}

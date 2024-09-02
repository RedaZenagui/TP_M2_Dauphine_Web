package com.programmingtechie.produitservice.repository;

import com.programmingtechie.produitservice.model.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProduitRepository extends MongoRepository<Produit, String> {
}

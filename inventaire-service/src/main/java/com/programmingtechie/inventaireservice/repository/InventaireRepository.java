package com.programmingtechie.inventaireservice.repository;

import com.programmingtechie.inventaireservice.model.Inventaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventaireRepository extends JpaRepository<Inventaire, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, int quantity);
}

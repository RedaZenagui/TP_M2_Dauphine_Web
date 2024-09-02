package com.programmingtechie.inventaireservice.controller;

import com.programmingtechie.inventaireservice.service.InventaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventaire")
@RequiredArgsConstructor
public class InventaireController {

    private final InventaireService inventaireService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) {
        return inventaireService.isInStock(skuCode, quantity);
    }
}

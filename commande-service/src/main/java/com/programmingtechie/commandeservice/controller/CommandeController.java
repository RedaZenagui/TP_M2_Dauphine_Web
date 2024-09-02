package com.programmingtechie.commandeservice.controller;

import com.programmingtechie.commandeservice.dto.CommandeRequest;
import com.programmingtechie.commandeservice.model.Commande;
import com.programmingtechie.commandeservice.service.CommandeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commande")
@RequiredArgsConstructor
public class CommandeController {

    private final CommandeService commandeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeCommande(@RequestBody CommandeRequest commandeRequest) {
        commandeService.placeCommande(commandeRequest);
        return "Commande Placed Successfully";
    }


}

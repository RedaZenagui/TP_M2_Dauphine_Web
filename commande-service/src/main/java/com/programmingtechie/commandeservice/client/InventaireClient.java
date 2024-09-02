package com.programmingtechie.commandeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventaire" , value ="inventaire" , url = "http://localhost:8082")
public interface InventaireClient {

    @RequestMapping(method = RequestMethod.GET , value = "/inventaire")
    boolean isInStock(@RequestParam String skuCode, Integer quantity);
}

package com.programmingtechie.commandeservice.dto;


import java.math.BigDecimal;

public record CommandeRequest(Long id, String skuCode, BigDecimal price, Integer quantity) {
}

package com.programmingtechie.commandeservice.dto;

import java.math.BigDecimal;

public record CommandeResponse (Long id, String skuCode, BigDecimal price, Integer quantity){
}

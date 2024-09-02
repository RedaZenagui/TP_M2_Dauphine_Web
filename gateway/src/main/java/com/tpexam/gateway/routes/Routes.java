package com.tpexam.gateway.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;

@Configuration

public class Routes {

    //functional endpoint prog model
    @Bean
    public RouterFunction<ServerResponse> produitServiceRoute() {
        return GatewayRouterFunctions.route("produit_service")
        .route(RequestPredicates.path("/api/produit") , HandlerFunctions.http("http://localhost:8080"))
                .build();

    }

    @Bean
    public RouterFunction<ServerResponse> commandeServiceRoute() {
        return GatewayRouterFunctions.route("commande_service")
                .route(RequestPredicates.path("/api/commande") , HandlerFunctions.http("http://localhost:8081"))
                .build();

    }

    @Bean
    public RouterFunction<ServerResponse> inventaireServiceRoute() {
        return GatewayRouterFunctions.route("inventaire_service")
                .route(RequestPredicates.path("/api/inventaire") , HandlerFunctions.http("http://localhost:8082"))
                .build();

    }

}

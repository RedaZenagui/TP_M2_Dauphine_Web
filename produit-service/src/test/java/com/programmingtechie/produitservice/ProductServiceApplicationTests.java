package com.programmingtechie.produitservice;

import com.programmingtechie.produitservice.dto.ProduitRequest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MongoDBContainer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProduitServiceApplicationTests {

    @ServiceConnection
    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:7.0.7");
    @LocalServerPort
    private Integer port;

    @BeforeEach
    void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    static {
        mongoDBContainer.start();
    }

    /* 
    @Test
    void shouldCreateProduit() throws Exception {
        ProduitRequest produitRequest = getProduitRequest();

        RestAssured.given()
                .contentType("application/json")
                .body(produitRequest)
                .when()
                .post("/api/produit")
                .then()
                .log().all()
                .statusCode(201)
                .body("id", Matchers.notNullValue())
                .body("name", Matchers.equalTo(produitRequest.name()))
                .body("description", Matchers.equalTo(produitRequest.description()))
                .body("price", Matchers.is(produitRequest.price().intValueExact()));
    }

    private ProduitRequest getProduitRequest() {
        return new ProduitRequest("Pantalon homme", "Pantalon homme", BigDecimal.valueOf(1200));
    }*/

}

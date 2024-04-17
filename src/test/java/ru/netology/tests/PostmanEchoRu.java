package ru.netology.tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoRu {
    @Test
    void postmanEchoRu(){
        String text = "Проверка сервиса";
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body(text)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));
    }
}

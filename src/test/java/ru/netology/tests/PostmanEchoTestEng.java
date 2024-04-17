package ru.netology.tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTestEng {
    @Test
    void postmanEchoTestEng() {
        String text = "PostmanEcho test";

        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body(text) // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text));

    }

}

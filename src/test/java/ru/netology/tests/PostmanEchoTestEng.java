package ru.netology.tests;

import org.junit.jupiter.api.Test;

public class PostmanEchoTestEng {
    @Test
    void postmanEchoTestEng() {

        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body(/* --> ваша проверка здесь <-- */)
        ;

    }

}

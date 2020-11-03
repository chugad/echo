package ru.netology.echo;

import com.sun.tools.xjc.model.CEnumConstant;
import io.restassured.mapper.ObjectMapperType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test
    public void TestOne(){
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("ff") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("ff"))
        ;
    }
}

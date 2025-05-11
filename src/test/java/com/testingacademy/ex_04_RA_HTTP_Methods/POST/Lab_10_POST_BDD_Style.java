package com.testingacademy.ex_04_RA_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class Lab_10_POST_BDD_Style {
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    public void test_POST_POSTIVE_CASE() {
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON)
                    .log().all()// used to print console messages (or)log everything what you are doing
                    .body(payload)
                .when()
                .   log().all().post()
                .then().statusCode(200);
    }
}

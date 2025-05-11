package com.testingacademy.ex_04_RA_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_07_GET_BDD_Style {

    @Test
    public void test_case_Positive(){
        String pin = "635207";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}

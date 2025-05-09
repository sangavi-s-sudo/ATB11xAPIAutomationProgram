package com.testingacademy.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class Lab_03_APITesting_MultipleTestCases {
    public static void main(String[] args) {

        String pin = "635207";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
// below two cases are negative cases
        pin = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);

        pin = " ";
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


// we need someone who can manage our test cases -> This is where the TestNg comes in picture
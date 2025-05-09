package com.testingacademy.ex_01_RA_Basics;


import io.restassured.RestAssured;

public class Lab01_RestAssured {
    public static void main(String[] args) {


        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                   .when()
                .get()
                   .then()
                .log().all().statusCode(200);


    }
}

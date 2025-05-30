package com.testingacademy.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_RestAssured {
    public static void main(String[] args) {

        // Gherkins Syntax
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
        // Then() -> Validation -> 200 oK, firstname == PRAMOD

        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us
        // base Path - /IN/560016

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pincode: ");
        String pin = sc.next();


        RestAssured
                    .given()
                        .baseUri("https://api.zippopotam.us")
                         .basePath("/IN/" + pin)
                    .when()
                        .get()
                    .then().log().all()
                        .statusCode(200);

        // This is known as builder pattern

    }
}


// we can verify headers , cookies, response body also
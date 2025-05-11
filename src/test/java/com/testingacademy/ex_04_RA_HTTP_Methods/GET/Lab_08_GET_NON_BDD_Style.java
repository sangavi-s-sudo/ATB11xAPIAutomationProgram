package com.testingacademy.ex_04_RA_HTTP_Methods.GET;
//non-Bdd approach is the scalable approach

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_08_GET_NON_BDD_Style {

    // non-Bdd says that we can have RequestSpecification, Response, ValidatableResponse
    // RequestSpecification is a inetrface which provides similar functionality as Given
    // Response which has similar functionality as WHen
    // ValidatableResponse which has similar functionality as Then

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_GET_NON_BDD() {
        String pincode = "560069";
// GIVEN
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);


        // WHEN
        response = r.when().log().all().get();
        System.out.println(response.asString());


        // Then
        vr = response.then().log().all();
    }



    @Test
    public void test_GET_NON_BDD_Negative() {
        String pincode = "@";
        // GIVEN
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);

        // WHEN
        response = r.when().log().all().get();
        System.out.println(response.asString());


        // Then
        vr = response.then().log().all();
    }
}
// This is scalable approach becoz we can reuse the interfaces
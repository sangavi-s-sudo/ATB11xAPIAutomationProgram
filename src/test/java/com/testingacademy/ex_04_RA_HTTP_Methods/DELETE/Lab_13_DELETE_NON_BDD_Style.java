package com.testingacademy.ex_04_RA_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_13_DELETE_NON_BDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_POSTIVE_DELETE(){
        String token = "efa2cd9b7a7b0f2";
        String bookingid = "583";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com/");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);

        r.log().all();

        response = r.when().log().all().delete();

        vr = response.then().statusCode(201);

    }
}

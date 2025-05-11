package com.testingacademy.ex_04_RA_HTTP_Methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_12_PUT_NON_BDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_case_PUT(){

        String payloadPut = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        String token = "efa2cd9b7a7b0f2";
        String bookingid = "582";


        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payloadPut);
        r.log().all();

        response = r.when().log().all().put();

        vr = response.then().statusCode(200);


    }
}

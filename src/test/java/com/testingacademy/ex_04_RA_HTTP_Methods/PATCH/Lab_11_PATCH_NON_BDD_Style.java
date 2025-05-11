package com.testingacademy.ex_04_RA_HTTP_Methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_11_PATCH_NON_BDD_Style {

    String token = "57a527a10fc922d";
    String bookingid = "582";

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_case_Postitives(){
        String payloadPatch = "{\n" +
                "    \"firstname\" : \"Lucky\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);
        r.contentType(ContentType.JSON);
        r.log().all();
        r.body(payloadPatch);
        r.cookie("token",token);

        response = r.when().log().all().patch();

        vr = response.then().log().all().statusCode(200);
    }
}

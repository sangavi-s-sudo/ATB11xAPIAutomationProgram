package com.testingacademy.ex_04_RA_HTTP_Methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_09_POST_NON_BDD_Style {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";

    @Test
    public void test_case_psotive_01(){
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.log().all();// used to print console messages (or) log everything what you are doing
        r.body(payload);


        response = r.when().log().all().post();

        vr = response.then().log().all().statusCode(200);

    }
}

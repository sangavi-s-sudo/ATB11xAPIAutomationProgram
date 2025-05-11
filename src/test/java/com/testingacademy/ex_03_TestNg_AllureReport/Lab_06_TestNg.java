package com.testingacademy.ex_03_TestNg_AllureReport;

// TestNg says that test cases that we created can  be managed by using TestNg annotations
// we not need main funcs instead we can add annotations like @test after installing testng dependency in pom.xml file

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab_06_TestNg { //Whenever we run this a temporary testNg.xml file will be created -> There these test cases are written and it will be deleted after execution
    // these temporary creation and deletion will be handled by IDE (IntellIj) but when it comes to git and CIO/CD -> IntellIj wont come in picture . SO we need to manually create testNg.xml file
    // TestNg can be created manually by installing **create testng xml** under settings -> Plugins.
    // then restart the IDE -> then right click the project we will see **create testNg XML**
    // Finally testNg.xml file is created
    String pin;

    @Test
    public void test_POSITIVE_TC1(){ // TestNg recognizes when we pass @Test Annotations and functions name should start with test
         pin = "635207";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void test_NEGATIVE_TC2(){
         pin = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
    @Test
    public void test_NEGATIVE_TC3(){
         pin = "@";
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

package ex_07_Payload_management.String;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
// In payload management -> String is very large , immutable, complicated, difficult to manage. So we can't use payload as Strings
// Instead we can use HashMap or class payload Management
public class APITesting027_01_RestAssured_TestNG_AssertJ_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

@Test
    public void test_case_AssertJ(){
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.log().all();
        requestSpecification.body(payload).log().all();


        response = requestSpecification.when().post();


        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


// This is rest assured default type of assertions
        validatableResponse.body("booking.firstname", Matchers.equalTo("Jim"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid",Matchers.equalTo(true));
        validatableResponse.body("bookingid",Matchers.notNullValue());

        // TestNG - Extract the details of the firstname, bookingId, lastname from Response.
       Integer bookingid = response.then().extract().path("bookingid");
        String firstName = response.then().extract().path("booking.firstname");
        String lastName = response.then().extract().path("booking.lastname");

        // TestNG Assertions - 75% used by companies

        // HardAssert -
        // This means that if any assertion fails,
        // the remaining statements in that test method will not be executed.
        Assert.assertEquals(firstName,"Pramod");
        Assert.assertEquals(lastName,"Brown");
        Assert.assertNotNull(bookingid);


        // by  using asserTJ -> this is the external third party library
        // we can use by installing the dependency in pom.xml and add the import also


        assertThat(bookingid).isNotNull().isPositive();
        assertThat(firstName).isEqualTo("pramod").isNotNull().isNotEmpty().isNotBlank().isAlphanumeric();
// AssertJ i.e) assertThat function is like a builder pattern
    // so  using assertJ we can write assertion in one line like a builder pattern


    }
}

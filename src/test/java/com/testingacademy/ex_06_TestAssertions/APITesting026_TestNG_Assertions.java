package com.testingacademy.ex_06_TestAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting026_TestNG_Assertions {

    @Test
    public void test_hardAssertExample(){
        System.out.println("Start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("pramod","Pramod");
        // Here the assertion fails becoz expected is not equal to actual result. Here the below line wont be printed becoz its a hardAssertion
        System.out.println("End of the program");
    }


    // Software Assertion

    @Test
    public void test_softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("pramod","Pramod");
        // Here the assertion fails becoz expected is not equal to actual result. But the below line anyway will be printed becoz it's a Soft Assertion

        System.out.println("End of program");
        softAssert.assertAll();
    }
}

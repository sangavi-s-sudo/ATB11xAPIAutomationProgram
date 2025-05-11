package com.testingacademy.ex_05_TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_DependsOnMethod {

    // @Test(dependsOnMethods): Runs this test only if specified methods pass.
    // If any dependency fails or is skipped, this test is skipped too.
    //You can specify multiple dependencies using a string array.

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test2() {
        System.out.println("method2");
        Assert.assertTrue(true);

    }
}
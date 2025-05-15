package com.testingacademy.ex_05_TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_AlwaysRun {
    @Test
    public void test_new_register(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true )  // it should always Run whatever happens
    public void test_login_page(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true, enabled = false ) // this case wont run becoz enabled = false
    public void test_normal(){
        Assert.assertTrue(true);
    }
}
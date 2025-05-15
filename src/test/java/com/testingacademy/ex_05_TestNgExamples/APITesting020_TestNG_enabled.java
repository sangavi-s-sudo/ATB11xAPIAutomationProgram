package com.testingacademy.ex_05_TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting020_TestNG_enabled {


    @Test
    public void test01(){
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test02(){
        Assert.assertTrue(true);
    }

    @Test
    public void test03(){
        Assert.assertTrue(true);
    }
}


// When we run by passing enabled = false -> it executes only test01, test03 method
// enabled = false skips the test case
// which means it executes only enabled = true
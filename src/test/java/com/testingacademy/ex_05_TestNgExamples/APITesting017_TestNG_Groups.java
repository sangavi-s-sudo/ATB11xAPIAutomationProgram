package com.testingacademy.ex_05_TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting017_TestNG_Groups {

    // sanity - 1
    // reg -> 3
    // p1 -> 2

    @Test(groups = {"sanity", "reg"}, priority = 1)// we are grouping the test case as sanity , regression
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"}, priority = 2)
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"p1", "reg"}, priority = 3)
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}

// Refer testng_groups_sanity.xml file for executing testng files
// we can create different testNg files for sanity , reg , p1.
//  we can exclude some cases also by adding exclude tag in testNg file
package com.testingacademy.ex_05_TestNgExamples;

import org.testng.annotations.Test;
// invocationCount ---> how many times you want to run the test cases

public class APITesting022_TestNG_invocationCount {
    @Test(invocationCount = 2)
    public void test01(){
        System.out.println("Hi"); // this will run 2 times
    }

    @Test(invocationCount = 3)
    public void test02(){
        System.out.println("Bye"); // this will run 3 times
    }

    @Test()
    public void test03(){ // this will run 1 time by default
        System.out.println("Bye");
    }
}


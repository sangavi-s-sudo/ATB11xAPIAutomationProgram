package com.testingacademy.ex_05_TestNgExamples;

import org.testng.annotations.Test;
// In @test annotation here if we don't add priority it will print output as 1 , 2, 4 (consider functions in alphabetical order)

// But after adding priority it will output as 1,2,3,4
// Lower priorities will be scheduled first
public class APITesting016_TestNG_Priority {

    @Test(priority = 1)
    public void t1(){
        System.out.println("1");
    }
    @Test(priority = 3)
    public void t2(){
        System.out.println("3");
    }
    @Test(priority = 2)
    public void t3(){
        System.out.println("2");
    }
    @Test(priority = 4)
    public void t4(){
        System.out.println("4");
    }

}
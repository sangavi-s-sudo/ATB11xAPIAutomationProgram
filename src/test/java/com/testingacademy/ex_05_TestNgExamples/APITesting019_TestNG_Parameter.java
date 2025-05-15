package com.testingacademy.ex_05_TestNgExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
// if we have some data -> that we need to pass from xml file to testNg we can use parameters


// for example if we want to run the same code in staging and prod
// here the code remains same but url differs ---> for this we can use **parameters*** concept
public class APITesting019_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void Demo1(String value){
        System.out.println("Hi! I am a demo func");
        System.out.println("you are running this param");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start the firefox");
        }

        else if (value.equalsIgnoreCase("chrome")){
            System.out.println("Start the chrome");
        }
    }
}


// To pass the parameter -> we need to create a parameter value in testNg file
// refer testng_Parameter_chrome.xml file



// Bases on th =e external xml we can switch the browser values without changing the code
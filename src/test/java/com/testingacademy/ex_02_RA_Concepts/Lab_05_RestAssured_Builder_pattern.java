package com.testingacademy.ex_02_RA_Concepts;
// this is by using builder pattern
// No question will come in interview
// see it for reference
public class Lab_05_RestAssured_Builder_pattern {


    public Lab_05_RestAssured_Builder_pattern step1(){
        System.out.println("step 1");
        return this;
    }

    public Lab_05_RestAssured_Builder_pattern step2(){
        System.out.println("step 2");
        return this;
    }

    public Lab_05_RestAssured_Builder_pattern step3(String p){
        System.out.println("step 3");
        return this; // it will return  reference of itself
    }

    public static void main(String[] args) {
        Lab_05_RestAssured_Builder_pattern bp = new Lab_05_RestAssured_Builder_pattern();
        bp.step1().step2().step3("abc"); // --> Here the advantage is we can use . operator like we used in rest assured
    }
}



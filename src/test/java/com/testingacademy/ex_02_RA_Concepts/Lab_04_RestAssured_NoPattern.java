package com.testingacademy.ex_02_RA_Concepts;

public class Lab_04_RestAssured_NoPattern {
    public static void main(String[] args) {
        Lab_04_RestAssured_NoPattern np = new Lab_04_RestAssured_NoPattern();
        np.step1();
        np.step2();
        np.step3("Naveen");
    }

    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3(String param) {
        System.out.println("Step 3");
    }

// This is without any builder pattern
}

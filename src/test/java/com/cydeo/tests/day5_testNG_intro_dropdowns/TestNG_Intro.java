package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod() {
        System.out.println("---> Before Class is running!");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("--->After Class is running!");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("--->AfterMethod is running!");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 is running...");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running...");
    }


}

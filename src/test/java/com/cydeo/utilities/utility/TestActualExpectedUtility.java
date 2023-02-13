package com.cydeo.utilities.utility;

public class TestActualExpectedUtility {

    public static void EqualTest(String actual, String expected){
        if (actual.equals(expected)){
            System.out.println("PASS");
        }else {
            System.err.println("FAIL");
            System.out.println("ACTUAL : " +actual +" EXPECTED : "+expected);
        }
    }
}

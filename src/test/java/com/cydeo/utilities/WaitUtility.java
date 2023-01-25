package com.cydeo.utilities;

public class WaitUtility {

    public static void sleep(double second){

        try {
            Thread.sleep ((long) (second*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

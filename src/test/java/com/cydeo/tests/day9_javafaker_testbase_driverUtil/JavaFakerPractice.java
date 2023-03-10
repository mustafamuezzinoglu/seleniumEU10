package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {

    @Test
    public void test1() {
//Creating Faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

///numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("505-###-####"));

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????"));

        System.out.println("faker.bothify(\"##?#-##?#-#?#?-##??\") = " + faker.bothify("##?#-##?#-#?#?-##??"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));

    }

    @Test
    public void test2() {
        Faker faker = new Faker(new Locale("tr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
    }



}

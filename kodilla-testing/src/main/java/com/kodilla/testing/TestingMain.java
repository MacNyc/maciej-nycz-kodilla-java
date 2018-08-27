package com.kodilla.testing;

import java.lang.*;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultAdd = calculator.addAToB(5, 5);

        if (resultAdd == 10) {
            System.out.println("Calculator OK");
        } else {
            System.out.println("Error!");
        }

        int resultSubstract = calculator.substractAFromB(15, 5);

        if (resultSubstract == 10) {
            System.out.println("Calculator OK");
        } else {
            System.out.println("Error!");
        }
    }
}
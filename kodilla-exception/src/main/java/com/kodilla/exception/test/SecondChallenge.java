package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();

        }

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(0, 1.5);
            System.out.println(result);

        } catch(Exception e){

            throw new Exception();

        } finally {

            System.out.println("\nObsluga bledu Java");

        }
        return "Done!";
    }

}
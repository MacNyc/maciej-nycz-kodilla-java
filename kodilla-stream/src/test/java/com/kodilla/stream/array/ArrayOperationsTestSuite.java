package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[5];
        numbers[0]= 10;
        numbers[1] = 10;
        numbers[2] = 10;
        numbers[3] = 50;
        numbers[4] = 100;

        //When
        double numbersAverage = ArrayOperations.getAverage(numbers);


        //Then
        double expectedAverage = 36;
        Assert.assertEquals(expectedAverage,numbersAverage,0);
    }
}
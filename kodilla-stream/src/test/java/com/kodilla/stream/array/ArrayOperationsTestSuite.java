package com.kodilla.stream.array;

import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;

        //When
        IntStream.range(0, numbers.length)
                .map(index -> numbers[index])
                .forEach(System.out::println);
        IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();

    }
}
package com.kodilla.testing.collection;

import org.junit. *;

import java.util.ArrayList;
import java.util.Random;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {


    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> exterminateList ArrayList <Integer> ();{
            ArrayList<Integer> even = new ArrayList<>();
            Random theGenerator = new Random();
            for (Integer n = 0; n < 50; n++) {
                exterminateList.add(theGenerator.nextInt(50));
            }
            for(int n = 0; n < 50; n++)
                if (n % 2 == 0) {
                    even.add(n);
                }
            return even;
        }
    }
}
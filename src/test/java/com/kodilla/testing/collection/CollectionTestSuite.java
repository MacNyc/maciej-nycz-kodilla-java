package com.kodilla.testing.collection;

import org.junit. *;
import java.util.ArrayList;
import java.lang. *;
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

    }

}
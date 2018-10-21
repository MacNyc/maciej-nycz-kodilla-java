package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class LoggerTestSuite {
    @BeforeClass
    public static void BeforeClass() {
        System.out.println("Application Start");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("Application End");
    }
    @Test
    public void testSingleInstance() {
        // Given
        // When
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Then
        assertSame(logger1, logger2);
    }

    @Test
    public void testGetLastLog() {
        // Given
        String lastLog = "one of the log";
        //When
        System.out.println("Lasto log: " + lastLog);

        // Then
        assertEquals("one of the log", lastLog);
    }
}
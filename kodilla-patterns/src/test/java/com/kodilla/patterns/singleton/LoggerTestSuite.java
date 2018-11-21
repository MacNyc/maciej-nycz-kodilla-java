package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeClass
    public static void BeforeClass() {
        logger = Logger.getInstance();
        System.out.println("Application Start");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("Application End");

    }

    @Test
    public void testGetLastLog() {
        // Given
        String logContent = "Last Log";
        logger.log(logContent);

        // When
        String lastLog = logger.getLastLog();

        // Then
        assertEquals(logContent, lastLog);
    }
}
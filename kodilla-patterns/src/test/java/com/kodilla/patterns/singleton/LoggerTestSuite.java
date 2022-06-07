package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void setLog() {
        logger = Logger.INSTANCE;
        logger.log("Logger check");

    }

    @Test
    void testGetLastLog(){


        String result = logger.getLastLog();

        assertEquals("Logger check", result);
    }
}

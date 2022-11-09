package com.kodilla.patterns.singleton;

import com.kodilla.patterns.signleton.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.INSTANCE;
        logger.log("First logging");
    }

    @Test
    void testLastLog() {
        //Given
        //When
        String actualLog = logger.getLastLog();
        System.out.println("Log: [" + actualLog + "]");
        //Then
        assertEquals("First logging", actualLog);
    }
}

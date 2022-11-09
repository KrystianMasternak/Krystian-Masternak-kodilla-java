package com.kodilla.patterns.singleton;

import com.kodilla.patterns.signleton.SettingsFlieEngine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

    public static SettingsFlieEngine settingsFlieEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFlieEngine = SettingsFlieEngine.INSTANCE;
        settingsFlieEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile() {
        settingsFlieEngine.close();
    }

    @Test
    void testGetName() {
        //Given
        //When
        String fileName = settingsFlieEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        assertEquals("myapp.settings", fileName);
    }

    @Test
    void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFlieEngine.loadSettings();
        //Then
        assertTrue(result);
    }

    @Test
    void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFlieEngine.saveSettings();
        //Then
        assertTrue(result);
    }


}

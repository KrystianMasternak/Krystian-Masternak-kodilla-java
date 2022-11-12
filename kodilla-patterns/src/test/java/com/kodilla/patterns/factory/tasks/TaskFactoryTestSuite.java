package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoopingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shooping = factory.makeTask(TaskFactory.SHOPPINGTASK);

        //Then
        assertEquals("Groceries", shooping.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);

        //Then
        assertEquals("Trip", driving.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);

        //Then
        assertEquals("Painting", painting.getTaskName());
    }
}

package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testDrivingTask(){
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals(driving.getTaskName(), "Removal Patric");
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testPaintingTask(){
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals(painting.getTaskName(), "Painting house");
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testShoppingTask(){
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals(shopping.getTaskName(), "Pizza");
        assertTrue(shopping.isTaskExecuted());
    }
}

package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask(){
        TaskFactory factory = new TaskFactory();

        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);
        shoppingTask.executeTask();

        assertEquals( "Shopping",shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){
        TaskFactory factory = new TaskFactory();

        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);
        paintingTask.executeTask();

        assertEquals("Painting living room", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask(){
        TaskFactory factory = new TaskFactory();

        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);
        drivingTask.executeTask();

        assertEquals("Driving to mom", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}

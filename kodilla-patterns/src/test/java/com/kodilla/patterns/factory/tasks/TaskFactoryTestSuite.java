package com.kodilla.patterns.factory.tasks;


import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask(){
        //When
        TaskFactory factory = new TaskFactory();

        //Given
        Task shoppingTask = factory.createTask(TaskFactory.XMASSSHOPPING);
        boolean before = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean after = shoppingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("buy Christmas ", shoppingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(after);

    }

    @Test
    public void testFactoryPaintingTask(){
        //When
        TaskFactory factory = new TaskFactory();

        //Given
        Task paintingTask = factory.createTask(TaskFactory.XMASSPAINTING);
        boolean before = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean after = paintingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("painting on Christmas baubles", paintingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(after);
    }

    @Test
    public void testFactoryDrivingTask(){
        //When
        TaskFactory factory = new TaskFactory();

        //Given
        Task drivingTask = factory.createTask(TaskFactory.XMASSDRIVING);
        boolean before = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean after = drivingTask.isTaskExecuted();

        //Then
        Assert.assertEquals("driving", drivingTask.getTaskName());
        Assert.assertFalse(before);
        Assert.assertTrue(after);
    }
}

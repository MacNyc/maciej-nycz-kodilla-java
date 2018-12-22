package com.kodilla.patterns2a2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTaskQueueTestSuite {
    @Test
    public void updateTest(){
        //Given
        TaskToMentorCheck taskToMentorCheck = new TaskToMentorCheck();
        StudentTaskQueue maciejnycz = new StudentTaskQueue("Maciej Nycz");
        StudentTaskQueue marianycz = new StudentTaskQueue("Maria Nycz");
        StudentTaskQueue nikodemnycz = new StudentTaskQueue("Nikodem Nycz");
        taskToMentorCheck.registerObserver(maciejnycz);
        //When
        taskToMentorCheck.addTask("Task 20.4 - done");
        //Then
        assertEquals(1, maciejnycz.getUpdateCounty());

    }
}

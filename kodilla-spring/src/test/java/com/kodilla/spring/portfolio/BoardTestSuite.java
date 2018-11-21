package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String toDoTask = "Task to do";
        String inProgressTask = "Task in progress";
        String doneTask = "Task done";

        // When
        boolean toDoAddResult = board.addToDoTask(toDoTask);
        boolean toInProgressResult = board.addInProgressTask(inProgressTask);
        boolean doneResult = board.addDoneTask(doneTask);

        //Then
        Assert.assertEquals(true, toDoAddResult);
        Assert.assertEquals(true, toInProgressResult);
        Assert.assertEquals(true, doneResult);
    }
}
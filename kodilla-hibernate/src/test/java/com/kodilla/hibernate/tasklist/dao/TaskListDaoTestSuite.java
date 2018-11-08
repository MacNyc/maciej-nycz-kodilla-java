package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME1 = "Test ListName";
    private static final String DESCRIPTION = "Test Despricption";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME1, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> listName = taskListDao.findByListName(LISTNAME1);
        Assert.assertEquals(1, listName.size());

        //CleanUp
        taskListDao.deleteAll();

    }
}

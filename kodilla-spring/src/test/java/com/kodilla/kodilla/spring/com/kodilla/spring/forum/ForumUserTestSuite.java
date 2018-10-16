package com.kodilla.kodilla.spring.com.kodilla.spring.forum;


import com.kodilla.spring.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String userName = forumUser.getUserName();
        //Then
        Assert.assertEquals("John Smith", userName);
    }
}

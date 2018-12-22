package com.kodilla.patterns2a2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        JavaHelpForumTopic javaHelpForumTopic = new JavaHelpForumTopic();
        JavaToolsForumTopic javaToolsForumTopic = new JavaToolsForumTopic();
        ForumUser maciejNycz = new ForumUser("Maciej Nycz");
        ForumUser mariaNycz = new ForumUser("Macie Nycz");
        ForumUser nikodemNycz = new ForumUser("Nikodem Nycz");
        javaHelpForumTopic.registerObserver(maciejNycz);
        javaToolsForumTopic.registerObserver(mariaNycz);
        javaHelpForumTopic.registerObserver(nikodemNycz);
        javaToolsForumTopic.registerObserver(nikodemNycz);
        //When
        javaHelpForumTopic.addPost("Hello everybody");
        javaHelpForumTopic.addPost("How are you?");
        javaToolsForumTopic.addPost("I need more time");
        javaHelpForumTopic.addPost("Christamss Time");
        javaToolsForumTopic.addPost("Winter time");
        //Then
        assertEquals(3, maciejNycz.getUpdateCounty());
        assertEquals(2, mariaNycz.getUpdateCounty());
        assertEquals(5, nikodemNycz.getUpdateCounty());


    }
}

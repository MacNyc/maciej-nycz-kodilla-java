package com.kodilla.patterns2a2.observer.forum;

public class ForumUser implements Observer {
    private final String userName;
    private int updateCounty;

    public ForumUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(userName +": New message in topic " + forumTopic.getName() + "\n" +
                " (total: " + forumTopic.getMessage().size() + " messages");
        updateCounty++;
    }

    public String getUserName() {
        return  userName;
    }

    public int getUpdateCounty() {
        return  updateCounty;
    }
}

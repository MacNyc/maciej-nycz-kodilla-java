package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(123, "MaciekNy", 'M', 1991,12,15,100));
        theUserList.add(new ForumUser(124, "MariaNy", 'F', 1993,01,12, 30));
        theUserList.add(new ForumUser(125, "NikodemNy", 'M', 2014,05,01, 0));
        theUserList.add(new ForumUser(126, "JadwigaNy", 'F', 1958,06,04, 1020));
        theUserList.add(new ForumUser(127, "GrzegorzNy", 'M', 1958,01,01, 800));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}


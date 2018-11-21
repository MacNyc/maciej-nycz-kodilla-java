package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int uniqUserID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postQuantity;

    public ForumUser(int uniqUserID, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int postQuantity) {
        this.uniqUserID = uniqUserID;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
    }

    public int getUniqUserID() {
        return uniqUserID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqUserID=" + uniqUserID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postQuantity=" + postQuantity +
                '}';
    }
}

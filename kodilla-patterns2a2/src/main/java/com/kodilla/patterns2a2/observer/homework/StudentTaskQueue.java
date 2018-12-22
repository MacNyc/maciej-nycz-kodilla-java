package com.kodilla.patterns2a2.observer.homework;

public class StudentTaskQueue implements ObserverStudent {
    private final String studentName;
    private int updateCounty;

    public StudentTaskQueue(String studentName) {
        this.studentName = studentName;
    }
    @Override
    public void update(MentorTaskQueue mentorTaskQueue) {
        System.out.println("The student's task from: " + studentName + " is in the module: " + mentorTaskQueue.getTaskName() + "\n" +
                "total: " + mentorTaskQueue.getMessage().size() + " messages");
        updateCounty++;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getUpdateCounty() {
        return updateCounty;
    }
}

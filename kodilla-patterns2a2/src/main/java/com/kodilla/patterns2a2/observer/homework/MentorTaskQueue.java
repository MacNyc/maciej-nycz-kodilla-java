package com.kodilla.patterns2a2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class MentorTaskQueue implements ObservableStudent {
    private final List<ObserverStudent> observers;
    private final List<String> message;
    private final String taskName;

    public MentorTaskQueue (String taskName){
        observers = new ArrayList<>();
        message = new ArrayList<>();
        this.taskName = taskName;
    }
    public void addTask(String task) {
        message.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(ObserverStudent observerStudent) {
        observers.add(observerStudent);
    }

    @Override
    public void notifyObservers() {
        for(ObserverStudent observerStudent : observers){
            observerStudent.update(this);
        }
    }

    @Override
    public void removeObserver(ObserverStudent observerStudent) {
        observers.remove(observerStudent);
    }

    public List<String> getMessage() {
        return message;
    }

    public String getTaskName() {
        return taskName;
    }
}

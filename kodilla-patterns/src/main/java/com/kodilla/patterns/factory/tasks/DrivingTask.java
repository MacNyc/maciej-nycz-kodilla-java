package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    String name;
    String where;
    String using;
    private boolean executed;

    public DrivingTask(String name, String where, String using) {
        this.name = name;
        this.where = where;
        this.using = using;
        this.executed = false;
    }

    @Override
    public void executeTask(){
        System.out.println("I thinking about: " + name + " "+ where + " by "+ using);
        executed = true;
    }

    @Override
    public String getTaskName(){
        return name;
    }

    @Override
    public boolean isTaskExecuted(){
        return executed;
    }
}


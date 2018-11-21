package com.kodilla.spring.portfolio;

public final class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        if (toDoList == null || inProgressList == null || doneList == null) {
            throw new IllegalArgumentException("null task list");
        }

        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public boolean addToDoTask(String task) {
        return toDoList.addTask(task);
    }

    public boolean addInProgressTask(String task) {
        return inProgressList.addTask(task);
    }

    public boolean addDoneTask(String task) {
        return doneList.addTask(task);
    }
}
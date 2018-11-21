package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    double quantity;
    private boolean executed;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.executed = false;
    }

    @Override
    public void executeTask(){
       System.out.println("I need to: " + taskName + whatToBuy +" it will be about " + quantity + " gifts");
       executed = true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}

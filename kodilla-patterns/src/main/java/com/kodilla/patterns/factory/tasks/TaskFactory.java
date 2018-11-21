package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String XMASSSHOPPING = "XMASSSHOPPING";
    public static final String XMASSPAINTING = "XMASSPAINTING";
    public static final String XMASSDRIVING ="XMASSDRIVING";

    public final Task createTask(final String taskClass){
        switch (taskClass){
            case XMASSSHOPPING : return new ShoppingTask("buy Christmas ", "gift", 15.0);
            case XMASSPAINTING : return new PaintingTask("painting on Christmas baubles", "green","Christmas tree");
            case XMASSDRIVING : return new DrivingTask("driving", "home", "car");
            default:
                return null;
        }
    }

}

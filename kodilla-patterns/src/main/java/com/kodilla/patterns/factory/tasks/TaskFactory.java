package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass){
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Groceries", "Yogurt", 3);
            case PAINTINGTASK -> new PaintingTask("Painting", "Red", "Livingroom");
            case DRIVINGTASK -> new DrivingTask("Trip", "Italy", "Airplane");
            default -> null;
        };
    }
}

package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String DRIVING_TASK  = "DRIVING TASK";

    public final Task createTask(final String taskClass) {
        switch(taskClass){
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Coffe", 2);
            case PAINTING_TASK:
                return new PaintingTask("Painting living room", "Blue", "Living room");
            case DRIVING_TASK:
                return new DrivingTask("Driving to mom", "Opole", "Tesla");
            default:
                return null;
        }
    }
}

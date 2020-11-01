package com.kodilla.patterns.factory.tasks;

public final     class TaskFactory {

    public static final  String DRIVING = "DRIVING";
    public static final  String PAINTING = "PAINTING";
    public static final  String SHOPPING = "SHOPPING";

    public final Task makeTask (final String taskClass) {
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Removal Patric","Madison Sst","Mercedes Vito");
            case PAINTING:
                return new PaintingTask("Painting house", "blue", "2 wall houses");
            case SHOPPING:
                return new ShoppingTask("Pizza", "cheese 500g", 2);
            default:
                return null;
        }
    }
}

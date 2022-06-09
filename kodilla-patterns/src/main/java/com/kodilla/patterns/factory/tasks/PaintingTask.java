package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute painting task: " + taskName + "\n"
                + "Color: " + color + "\n" + "What to paing: " + whatToPaint);
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (isExecuted){
            System.out.println("Painting task is executed!");
            return true;
        } else {
            System.out.println("Task is not executed");
        }
        return false;
    }
}

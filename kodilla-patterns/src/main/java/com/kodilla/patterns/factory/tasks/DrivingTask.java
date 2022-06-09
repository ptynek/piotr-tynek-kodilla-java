package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;

    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute driving task: " + taskName + "\n"
            + "Where: " + where + "\n" + "Using: " + using);
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {

        if (isExecuted){
            System.out.println("Driving task is executed!");
            return true;
        } else {
            System.out.println("Task is not executed");
        }

        return false;
    }
}

package com.kodilla.spring.portfolio;

import org.springframework.scheduling.config.Task;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public Board(){

    }

    public TaskList addToDo(String text) {
        toDoList.getTasks().add(text);
        return toDoList;
    }

    public TaskList addInProgress(String text) {
        inProgressList.getTasks().add(text);
        return inProgressList;
    }

    public TaskList addDoneList(String text){
        doneList.getTasks().add(text);
        return doneList;
    }

    public void showLists(){
        System.out.println("To do: " + toDoList);
        System.out.println("In progress: " + inProgressList );
        System.out.println("Done: " + doneList);
    }
}

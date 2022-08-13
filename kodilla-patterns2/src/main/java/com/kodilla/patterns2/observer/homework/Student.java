package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Student implements Observable{

    private final List<Observer> observers;
    private final Deque<String> deque;
    private final String name;

    public Student(String name) {
        observers = new ArrayList<>();
        deque = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String task){
        deque.add(task);
        notifyObserversx();
    }

    @Override
    public void registerObserverx(Observer observer){
        observers.add(observer);

    }

    @Override
    public void notifyObserversx() {
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserverx(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getDeque() {
        return deque;
    }

    public String getName() {
        return name;
    }
}

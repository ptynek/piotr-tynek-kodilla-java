package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        if (n >=0 && n < figures.size()){
            return figures.get(n);
        }
        return null;
    }

    public String showFigures(){
         String figuresToString = "";
         for (Shape figure:figures){
             figuresToString = figuresToString + "" + figure.getShapeName();
         }
         return figuresToString;
    }
}

interface Shape {

    String getShapeName();
    double getField();
}

class Triangle implements Shape {

    private String name;
    private double height;
    private double base;

    public Triangle(String name, double height, double base) {
        this.name = name;
        this.height = height;
        this.base = base;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return (height * base) / 2;
    }
}

class Square implements Shape {

    private String name;
    private int side;

    public Square(String name, int side) {
        this.name = name;
        this.side = side;
    }

    public String getShapeName(){
        return name;
    }

    public double getField(){
        return side * side;
    }
}

class Circle implements Shape {

    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){

        double field = 3.14 * (radius * radius);

        return field;
    }
}




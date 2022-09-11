package ru.mirea.task2;

public class Shape {
    String type;
    double area;

    public Shape(String type, double area) {
        this.type = type;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape {" +
                "Type: " + type +
                ", " +
                "Area: " + area +
                '}';
    }
}

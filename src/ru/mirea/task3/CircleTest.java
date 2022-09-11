package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(0.0, 0.0, 5);
        System.out.println(circle);
        circle.setX(5);
        circle.setRadius(-5);
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        circle.setRadius(20);
        System.out.println(circle.getPerimeter());
    }
}

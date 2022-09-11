package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("Первый мяч");
        Ball ball = new Ball();
        System.out.println(ball);
        System.out.println("X - " + ball.getX());
        System.out.println("Y - " + ball.getY());
        ball.setX(5.0);
        System.out.println("X - " + ball.getX());
        ball.setXY(2.5, 6.4);
        System.out.println(ball);

        System.out.println();

        System.out.println("Второй мяч");
        Ball secondBall = new Ball(1.5, 8.0);
        System.out.println(secondBall);
        System.out.println("X - " + ball.getX());
        System.out.println("Y - " + ball.getY());
        ball.setY(7.0);
        System.out.println("Y - " + ball.getY());
        ball.move(5.5, 5.3);
        System.out.println(ball);
    }
}

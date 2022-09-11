package ru.mirea.task2;

public class TestClass {
    public static void main(String[] args) {
        shapes();

        System.out.println();

        ball();

        System.out.println();

        book();
    }

    private static void book() {
        Book flowers = new Book("Цветы для Элджернона", 320);
        System.out.println(flowers);
        flowers.read(2);
        printState(flowers);
        flowers.read(5);
        printState(flowers);
    }

    private static void printState(Book book) {
        if (!book.isRead()) {
            System.out.printf(
                    "Вам осталось прочитать ещё %s страниц книги \"%s\"%n",
                    book.getLeftPages(),
                    book.getName()
            );
        } else {
            System.out.printf("Поздравляю! Вы прочитали всю книгу \"%s\"", book.getName());
        }
    }

    private static void ball() {
        Ball ball = new Ball();
        ball.kick();
        ball.kick();
        ball.run();
    }

    private static void shapes() {
        Shape circle = new Shape("Circle", 5);
        System.out.println(circle);

        Shape square = new Shape("Square", 6);
        System.out.println(square);

        Shape triangle = new Shape("Triangle", 9);
        System.out.println(triangle);

        //Shape shape = new Shape();
    }
}



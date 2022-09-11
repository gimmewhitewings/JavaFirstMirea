package ru.mirea.task3;

public class TestClass {
    public static void main(String[] args) {
        human();
        System.out.println();
        book();
    }

    private static void book() {
        Book master = new Book("Булгаков", "Мастер и Маргарита", 1940, 416);
        System.out.println(master);
        master.setAuthor("Михаил Афанасьевич Булгаков");
        System.out.println(master);
        System.out.println("Год написания - " + master.getYear());
        System.out.println("Количество страниц - " + master.getPagesAmount());
    }

    private static void human() {
        Human nadya = new Human("Надя", "Каштановые", "Карие", 37);
        nadya.head.say("Я хочу есть");
        nadya.rightHand.take("Яблоко");
        nadya.rightHand.take("Сыр");
        nadya.rightHand.release();
        nadya.rightHand.take("Сыр");
        nadya.head.say("Мммм...");
        System.out.println("Размер левой ноги: " + nadya.leftLeg.getSize());
        System.out.println("Размер правой ноги: " + nadya.rightLeg.getSize());
    }
}

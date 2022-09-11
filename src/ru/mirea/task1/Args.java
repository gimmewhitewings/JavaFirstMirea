package ru.mirea.task1;

public class Args {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");

        System.out.println("Общее количество аргументов: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент" + i + ": " + args[i]);
        }
    }
}

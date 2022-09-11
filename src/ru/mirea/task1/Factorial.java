package ru.mirea.task1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(fact(number));
    }

    private static int fact(int number) {
        int fact = 1;
        while (number != 1) {
            fact *= number;
            number--;
        }
        return fact;
    }
}

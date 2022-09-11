package ru.mirea.task1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        getSumFor(numbers);

        getSumWhile(numbers);

        getSumDoWhile(numbers);
    }

    private static void getSumFor(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    private static void getSumWhile(int[] numbers) {
        int i =0;
        int sum = 0;

        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        System.out.println(sum);
    }

    private static void getSumDoWhile(int[] numbers) {
        int sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.println(sum);
    }
}

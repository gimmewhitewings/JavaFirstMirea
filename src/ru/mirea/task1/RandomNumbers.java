package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println("Метод random класса Math");
        int[] firstArray = randomMath(new int[10]);
        System.out.println(Arrays.toString(firstArray));
        selectionSort(firstArray);
        System.out.println(Arrays.toString(firstArray));


        System.out.println("Класс Random");
        int[] secondArray = randomClass(new int[10]);
        System.out.println(Arrays.toString(secondArray));
        selectionSort(secondArray);
        System.out.println(Arrays.toString(secondArray));
    }

    private static int[] randomMath(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }

    private static int[] randomClass(int[] arr) {
        final Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(random.nextInt() % 100);

        }
        return arr;
    }

    private static void selectionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            int temp = arr[left];
            arr[left] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}

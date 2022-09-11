package ru.mirea.task1;

public class Harmonic {
    public static void main(String[] args) {
        harmonic(10);
    }

    private static void harmonic(int amount) {
        for (int i = 1; i < amount + 1; i++) {
            double element = 1.0 / i;
            String str = String.format("%.3f", element);
            System.out.println(str);
        }
    }
}

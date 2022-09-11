package ru.mirea.task2;

public class Ball {
    boolean isNearby = true;

    public void kick() {
        if (isNearby) {
            System.out.println("Вы пнули мяч! Полетел далеко, но теперь придётся за ним бежать...");
            isNearby = false;
        } else {
            System.out.println("Вы не можете пнут мяч, который улетел. Бегите за ним!");
        }
    }

    public void run() {
        if (isNearby) {
            System.out.println("Зачем бежать за мячом, который уже у вас под ногами?");
        } else {
            isNearby = true;
            System.out.println("Ура, мяч у вас! Теперь можно снова его пнуть)");
        }
    }
}

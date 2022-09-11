package ru.mirea.task3;

public class Hand {

    private boolean isBusy;
    private String object;

    String name;

    public Hand(String name) {
        this.isBusy = false;
        this.name = name;
    }

    public void take(String object) {
        if (isBusy) {
            System.out.println(name + " уже держит " + this.object + " в этой руке, поэтому нельзя взять " + object);
        } else {
            System.out.println(name + " взял(a) объект " + object);
            this.object = object;
            isBusy = true;
        }
    }

    public void release() {
        System.out.println(name + " отпустил(a) " + this.object);
        isBusy = false;
    }
}

package ru.mirea.task3;

public class Head {
    String hairColor, eyeColor, name;

    public Head(String name, String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
    }

    public void say(String sentence) {
        System.out.println(name + ": " + sentence);
    }
}

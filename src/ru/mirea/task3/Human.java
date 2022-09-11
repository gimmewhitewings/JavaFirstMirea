package ru.mirea.task3;

public class Human {
    Head head;
    Hand leftHand, rightHand;
    Leg leftLeg, rightLeg;
    public String name;

    public Human(String name, String hairColor, String eyeColor, int legSize) {
        this.name = name;
        this.head = new Head(name, hairColor, eyeColor);
        this.leftHand = new Hand(name);
        this.rightHand = new Hand(name);
        this.leftLeg = new Leg(legSize);
        this.rightLeg = new Leg(legSize);
    }


}

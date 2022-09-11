package ru.mirea.task2;

import java.util.Arrays;

public class TestDog {
    public static void main(String[] args) {
        Dog[] nursery = {
                new Dog("Duke", 5),
                new Dog("Count", 6),
                new Dog("Rex", 1),
                new Dog("Snowflake", 3)
        };
        printNursery(nursery);
        System.out.println();
        nursery = addDog(nursery, new Dog("Puppy", 2));
        printNursery(nursery);

        System.out.println();

        System.out.println(nursery[2]);
        nursery[2].setName("Fluffy");
        System.out.println(nursery[2]);

        System.out.println();

        System.out.println(
                "Имя собаки: " +
                        nursery[0].getName() +
                        "; Возраст в собачьих годах: " +
                        nursery[0].getAge() +
                        "; Возраст в человеческих годах: " +
                        nursery[0].humanAge()
        );
    }

    private static Dog[] addDog(Dog[] nursery, Dog newDog) {
        Dog[] newNursery = Arrays.copyOf(nursery, nursery.length + 1);
        newNursery[newNursery.length - 1] = newDog;
        return newNursery;
    }

    private static void printNursery(Dog[] nursery) {
        for (Dog dog :
                nursery) {
            System.out.println(dog);
        }
    }
}

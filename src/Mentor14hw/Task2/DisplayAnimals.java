package Mentor14hw.Task2;

import Mentor11hw.Car;

public class DisplayAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Stubby", "haw-haw", "Golden retriever");
        System.out.println(dog);
        dog.makeSound();

        Cat cat = new Cat("Bob", "meow", "white");
        System.out.println(cat);
        cat.makeSound();

    }
}

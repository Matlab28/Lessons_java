package Zoopark;

public class Animal {
    static int totalVisitors = 0;
    String name;
    String species;
    int lifespan;


    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.lifespan = age;
        totalVisitors++;
    }

    String makeSound(String rabbit) {
        return rabbit;
    }

    // control + alt + shift + l
    // command + option + shift + l

    int getTotalVisitors() {
        return totalVisitors;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", species='" + species + '\'' + ", lifespan=" + lifespan + '}';
    }
}

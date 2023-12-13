package Mentor14hw.Task2;

public class Dog extends Animal{

    private String breed;
    public Dog(String name, String sound, String breed) {
        super(name, sound);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}

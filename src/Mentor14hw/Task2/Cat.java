package Mentor14hw.Task2;

public class Cat extends Animal{
    private String color;
    public Cat(String name, String sound, String color) {
        super(name, sound);
        this.color = color;
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}

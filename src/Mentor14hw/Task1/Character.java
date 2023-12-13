package Mentor14hw.Task1;

public class Character {
    protected String name;

    public void attack(int damage){
        System.out.println(name + " attacks");
    }

    public Character(String name) {
        this.name = name;
    }


}

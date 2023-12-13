package Mentor14hw.Task2;

import java.util.Objects;

public class Animal {
   protected String name;
   protected String sound;

   public void makeSound(){
       System.out.println(name + " sound is " +  sound);
   }

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
}

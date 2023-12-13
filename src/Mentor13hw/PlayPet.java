package Mentor13hw;

import java.util.Scanner;

public class PlayPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your pet - ");
        String nameOfPet = scanner.nextLine();
        System.out.print("Enter the " + nameOfPet + "'s happiness level (1-100)- " );
        int happiness = scanner.nextInt();
        System.out.print("Enter the " + nameOfPet + "'s hunger level of (1-100)- ");
        int hunger = scanner.nextInt();

        VirtualPet pet = new VirtualPet(hunger, happiness, nameOfPet);
        System.out.println(pet);

        VirtualPet virtualPet1 = new VirtualPet();
        virtualPet1.setName("tom");
        virtualPet1.setHappinessLevel(80);
        virtualPet1.setHungerLevel(70);



        pet.feed();
        pet.play();
    }
}

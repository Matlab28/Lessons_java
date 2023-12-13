package Main11hw;

import java.util.Scanner;

public class NameSurname {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your surname: ");
        String surname = scanner.next();

        String fullName = name.concat(" ").concat(surname);
        System.out.println("Your full name is - " + fullName);
    }
}

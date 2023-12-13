package Mentor12hw;

import java.util.Locale;
import java.util.Scanner;

public class StMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string - ");
        String string = scanner.nextLine();

//        String string = "Hello, I want an apple world";
//        String string = "Hi, I want to eat banana";


        // length of string
        System.out.println("The length of string - " + string.length());

        // checking string does it contain "apple" word or not
        if (string.contains("apple")) {
            System.out.println("String contains apple");
        } else {
            System.out.println("String doesn't contain apple");
        }


        // replacement automatically if sentence contains "apple". It will replace with "orange'
        System.out.println("If your sentence contains 'apple' word, it will replace with 'orange' automatically.");
        if (string.contains("apple")){
            System.out.println(string.replace( "apple","orange"));
        } else {
            System.out.println("Your sentence doesn't contain 'apple'.");
        }

        // lowercase of string
        System.out.println("Lowercase of your string: " + string.toLowerCase());

        // uppercase of string
        System.out.println("Uppercase of your string: " + string.toUpperCase());


//        int sizeOfString = 5;
//
//        if (string.equals(sizeOfString)) {
//            System.out.println("First five characters of your 'string sentence' " );
//        }





//        System.out.println("Your sentence, without first five characters:");
//        System.out.println();
//
//
//        if (string.length() > 5) {
//            System.out.println("Your sentence, without last five characters:");
//            System.out.println(string.substring(string.length() - 5));
//        } else {
//            System.out.println("Your sentence not enough for this");
//        }


        // checking if sentence starts with "Hello"

        if (string.startsWith("Hello")) {
            System.out.println("Your sentence starts with 'Hello'");
        } else {
            System.out.println("Your sentence doesn't start with 'Hello'");
        }

        if (string.endsWith("world")) {
            System.out.println("Your sentence ends with 'world'");
        } else {
            System.out.println("Your sentence doesn't end with 'world'");
        }
    }
}

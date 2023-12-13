package Mentor12hw;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
//        Movie movie = new Movie("The Curious Case of Benjamin Button",2008,7.8,"Romance/Fantasy");
//        System.out.println(movie);

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many movies do you want to add? ");
        int[] array = new int[scanner.nextInt()];
        System.out.println();

        Movie [] arr = new Movie[array.length];

        for (int i = 0; i <= array.length-1; i++) {
//            System.out.println(array[i]);

            System.out.print(i + ") " + "Enter the title of movie - ");
            String title = scanner.next();
            System.out.print(i + ") " + "Enter the genre of movie - ");
            String genre = scanner.next();
            System.out.print(i + ") " + "Enter the year of movie - ");
            int year = scanner.nextInt();
            System.out.print(i + ") " + "Enter the rate of movie - ");
            double rate = scanner.nextDouble();

            Movie movie = new Movie(title,year,rate,genre);
            arr[i] = movie;
            System.out.println(movie);
            System.out.println();
            System.out.println();
        }





    }
}

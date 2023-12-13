package Books;

import java.util.Scanner;

public class AboutBook {
    public static void main(String[] args) {
        Book book = new Book();

        Scanner scanner = new Scanner(System.in);


        System.out.print("How many books do you want to add? ");


        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length ; i++) {
//            System.out.println("\n");
            System.out.print("Please, enter book's name: ");
            book.bookName = scanner.next();
            System.out.print("Please, enter author's name: ");
            book.authorName = scanner.next();
            System.out.print("Please, enter the language: ");
            book.language = scanner.next();
            System.out.print("Please, enter the number of pages: ");
            book.pages = scanner.nextInt();


            if (book.pages > 0) {
                System.out.println(book);
                System.out.println();
            } else {
                System.out.println("Please, enter the right number (PS: Edit the number of pages): ");
            }

        }


//        System.out.println(book);
    }
}

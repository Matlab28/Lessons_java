package Mix1110;

import Mix1110.Author10;
import Mix1110.Book10;

public class BookInfo {
    public static void main(String[] args) {

        int a = 5;


        Author10 author = new Author10();
        author.birthYear = 1903;
        author.name = "Jack London (John Griffith Chaney)";

        author =null;

        Book10 book = new Book10();
        book.publicationYear = 1912;
        book.title = "The Scarlet Plague";
        book.author = author;


            System.out.println(book);
        System.out.println(author);

    }
}

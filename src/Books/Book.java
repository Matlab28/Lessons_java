package Books;

public class Book {
    String bookName;
    String authorName;
    int pages;
    String language;

    @Override
    public String toString() {
        return "Books.Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", page=" + pages +
                ", language='" + language + '\'' +

                '}';
    }
}

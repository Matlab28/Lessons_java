package Mentor12hw;

public class Movie {
    static int totalMovies=0;
    String title;
    int year;
    double rating;
    String genre;

    String getTitle() {
        return title;
    }

    String getGenre() {
        return genre;
    }

    int getYear() {
        return year;
    }

    double getRating() {
        return rating;
    }

    void displayInfo(){
        getGenre();
        getRating();
        getYear();
        getTitle();
    }

    static int displayTotalMovies;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Movie(String title, int year, double rating, String genre) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
        totalMovies++;
    }
}

package Mix;

public class Rectangle {
    int firstSide;
    int secondSide;

    static int counter = 0;


    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        counter++;
    }

    int area() {
        return firstSide * secondSide;
    }

    int perimeter() {
        return (firstSide + secondSide) * 2;
    }



}

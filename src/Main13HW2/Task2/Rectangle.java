package Main13HW2.Task2;

public class Rectangle extends Shape {

    public int b;

    public int a;

    @Override
    int calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Rectangle(int b, int a) {
        this.b = b;
        this.a = a;
    }
}

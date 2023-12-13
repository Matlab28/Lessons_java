package Main13HW2.Task2;

public class Circle extends Shape{
    @Override
    int calculateArea() {
        return (int) (a * a * Math.PI);
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                '}';
    }
}

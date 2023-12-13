package Mentor11hw;

public class Car {
    int id;
    String make;
    String model;
    int price;
    int year;
    double engine;
    int odometer;
    String color;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", engine=" + engine +
                ", odometer=" + odometer +
                ", color='" + color + '\'' +
                '}';
    }
}

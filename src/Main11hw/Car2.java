package Main11hw;

public class Car2 {
    String brand;
    String model;
    int year;

    @Override
    public String toString() {
        return "Car2{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }


    public Car2(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

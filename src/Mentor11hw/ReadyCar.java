package Mentor11hw;

public class ReadyCar {
    public static void main(String[] args) {
        Manufacture manufacture = new Manufacture();
        manufacture.country = "United Kingdom";
        manufacture.id = 1;
        manufacture.name = "Bentley";


        Manufacture manufacture1 = new Manufacture();
        manufacture1.country = "Germany";
        manufacture1.name = "Porsche";
        manufacture1.id = 2;


        Car car2 = new Car();
        car2.price = 200000;
        car2.engine = 0.0;
        car2.make = "Porsche";
        car2.model = "Taycan";
        car2.odometer = 12342;
        car2.year = 2023;
        car2.color = "White";

        Car car = new Car();
        car.id = 2;
        car.color = "Black";
        car.make = "Bentley";
        car.model = "Continental GT";
        car.engine = 6.0;
        car.odometer = 100000;
        car.price = 240000;
        car.year = 2023;

//        Car[] cars = new Car[]{cars};


        manufacture.car = car;


        Manufacture[] manufacture2 = new Manufacture[]{manufacture};

        System.out.println(manufacture2);

//        System.out.println(manufacture);

    }
}

package Main13HW2.Task1;

public class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numDoors=" + numDoors +
                '}';
    }
}

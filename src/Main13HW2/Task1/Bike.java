package Main13HW2.Task1;

public class Bike extends Vehicle {

    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numWheels=" + numWheels +
                '}';
    }
}

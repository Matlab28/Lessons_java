package Main13hw;

public class Car2 extends Vehicle2 {
    private int numDoors;

    public Car2(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
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
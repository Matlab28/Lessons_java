package Main13hw;

public class Bike2 extends Vehicle2 {
    public Bike2(String make, String model) {
        super(make, model);
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
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    private int numWheels;

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public Bike2(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }
}

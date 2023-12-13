package Main14HW.Task2;

public class Motorcycle extends Vehicle{
    @Override
    public void star() {
        super.star();
        boolean work = true;
        if (work) {
            System.out.println("This motorcycle works.");
        } else {
            System.out.println("It doesn't work");
        }
    }
}

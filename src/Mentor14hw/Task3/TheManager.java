package Mentor14hw.Task3;

public class TheManager extends Employee{
    private int teamSize;
    public TheManager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void geDetails() {
        super.geDetails();
        System.out.println("He/She is a manager");
        System.out.println("Salary : " + salary);
    }

    @Override
    public String toString() {
        return "TheManager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", teamSize=" + teamSize +
                '}';
    }
}

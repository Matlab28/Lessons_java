package Mentor14hw.Task3;

public class TheDeveloper extends Employee{
    private String programLanguage;


    public TheDeveloper(String name, int salary, String programLanguage) {
        super(name, salary);
        this.programLanguage = programLanguage;
    }

    @Override
    public void geDetails() {
        super.geDetails();
        System.out.println("He/She is a developer");
        System.out.println("Salary : " + salary);
    }

    @Override
    public String toString() {
        return "TheDeveloper{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", programLanguage='" + programLanguage + '\'' +
                '}';
    }
}

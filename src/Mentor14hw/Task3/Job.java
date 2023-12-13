package Mentor14hw.Task3;

public class Job {
    public static void main(String[] args) {
        TheManager manager = new TheManager("name", 1600,12);
       // System.out.println(manager);
        manager.geDetails();

        TheDeveloper developer = new TheDeveloper("nameDeveloper", 1200,"JAVA");
     //   System.out.println(developer);
        developer.geDetails();
    }
}

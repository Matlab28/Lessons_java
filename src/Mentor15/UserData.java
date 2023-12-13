package Mentor15;

public class UserData {
    private String name;
    private String email;
    private int age;

    public void storeData(String name) {
        System.out.println("User's name - " + name);
    }

    public void storeData(String name, int age) {
        System.out.println("User's name and age - " + name + ", " + age);
    }

    public void storeData(String name, int age, String email) {
        System.out.println("User's name, age, and email - " + name + ", " + age + ", " + email);
    }

    public UserData(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

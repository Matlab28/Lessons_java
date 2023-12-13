package Buildings;

public class Person {
    int id;
    String name;
    String surname;
    int age;
    String profession;
    int numberOfFamilies;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", numberOfFamilies=" + numberOfFamilies +
                '}';
    }
}

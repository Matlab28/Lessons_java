package Mentor11hw;

public class Manufacture {
    int id;
    String name;
    String country;

    Car car;

    //Car[] cars;

    @Override
    public String toString() {
        return "Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", car=" + car +
                '}';
    }
}

package Mix;

public class Products {
    String name;
    int id;
    int price;
    int count;
    String color;

    @Override
    public String toString() {
        return "Mix.Products{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", count=" + count +
                ", color='" + color + '\'' +
                '}';
    }
}

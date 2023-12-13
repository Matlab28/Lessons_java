package Mix;

import java.util.Arrays;

public class Category {
    String name;
    String description;
    int id;

    Products[] products;

    @Override
    public String toString() {
        return "Mix.Category{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}

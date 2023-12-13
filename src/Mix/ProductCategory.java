package Mix;

import Mix.Category;

public class ProductCategory {
    public static void main(String[] args) {
        Category category = new Category();

        category.name = "Telephone";
        category.description = "For Sale";
        category.id = 12;

        Products products = new Products();


                products.name = "iPhone";

                products.id = 123;

                products.color = "Gold";

                products.count = 23;

        Products[] products1 = new Products[]{products};






        category.products=products1;

        System.out.println(category);


    }
}

package Mix;

import Mix.Rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Area of rectangle - " + rectangle.area());
        System.out.println("Perimeter of rectangle - " + rectangle.perimeter());
        System.out.println();

        Rectangle rectangle1 = new Rectangle(6,8);
        System.out.println("Area of rectangle - " + rectangle1.area());
        System.out.println("Perimeter of rectangle - " + rectangle1.perimeter());
        System.out.println();

        Rectangle rectangle2 = new Rectangle(9,5);
        System.out.println("Area of rectangle - " + rectangle2.area());
        System.out.println("Perimeter of rectangle - " + rectangle2.perimeter());
        System.out.println();

        System.out.println(Rectangle.counter);

    }
}

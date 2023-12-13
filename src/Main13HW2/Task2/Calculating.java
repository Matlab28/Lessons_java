package Main13HW2.Task2;

import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.calculateArea());
        Circle circle = new Circle();
        System.out.println("Enter the size of radius (or one side of the rectangle)");
        System.out.println(circle.calculateArea());

//        System.out.println(circle.a = scanner.nextInt());
    }
}

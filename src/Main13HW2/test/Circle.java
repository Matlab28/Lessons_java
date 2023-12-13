package Main13HW2.test;

import java.util.Scanner;

public class Circle extends Shape{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double reasult = Shape.calculateCircle(3);
        System.out.print("Enter the radius of circle - ");
        double result = Shape.calculateCircle(scanner.nextDouble());
        System.out.println("Area of circle: " + result);


        System.out.print("Enter the height of rectangle - ");
        System.out.println("Enter the length of rectangle - ");
        double result2 = Shape.calculateRectange(scanner.nextInt(), scanner.nextInt());
//        double result2 = Shape.calculateRectange(10, 10);
        System.out.println("Area of rectangle: " + result2);



    }

}

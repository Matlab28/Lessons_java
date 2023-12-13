package Main11hw;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of calculating area of circle - ");
        double radius = scanner.nextDouble();

        double answer = circle.circle(radius);
        System.out.println("Area is - " + answer);
    }
}

package Main14HW.Task1;

import java.util.Scanner;

public class DisplayIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator calculator = new ShapeCalculator();
        System.out.print("Please, enter the radius of circle for calculating its area - ");
        calculator.calculate(3);
        System.out.println();
        calculator.calculate(3,4,4);
    }
}

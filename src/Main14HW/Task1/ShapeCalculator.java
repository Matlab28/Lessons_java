package Main14HW.Task1;

public class ShapeCalculator {
    private int radius;
    private int heightOfTriangle;
    private int widthOfRectangle;


    public int calculate(int radius) {
        return (int) (radius * radius * Math.PI);
    }

    public int calculate(int radius, int heightOfTriangle, int seatOfTriangle) {
        int circle = (int) (radius * radius * Math.PI);
        return (heightOfTriangle * seatOfTriangle) / 2;
    }

    public int calculate(int radius, int heightOfTriangle, int seatOfTriangle, int widthOfRectangle, int heightOfRectangle) {
        int circle = (int) (radius * radius * Math.PI);
        int triangle = (heightOfTriangle * seatOfTriangle) / 2;
        return widthOfRectangle * heightOfRectangle;
    }
}

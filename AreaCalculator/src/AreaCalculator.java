public class AreaCalculator {

    public static final int INVALID_VALUE = -1;

    public static double area(double radius) {

        if (radius < 0) {
            return INVALID_VALUE;
        }
        double circleArea = radius * radius * Math.PI;
        return circleArea;
    }

    public static double area(double x, double y) {

        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        }

        double recArea = x * y;
        return recArea;
    }
}

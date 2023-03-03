public class PositiveNegativeZero {
    public static void main(String[] args) {


    checkNumber(0);
    checkNumber(1);
    checkNumber(-1);
    }
    public static void checkNumber(int number) {
        String value = "";
        if (number > 0) {
            value = "positive";
        } else if (number < 0) {
            value = "negative";
        } else {
            value = "zero";
        }
        System.out.println(value);
    }
}

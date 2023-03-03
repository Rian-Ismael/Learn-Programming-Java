public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(FirstLastDigitSum.FirstLastDigitSum(7));
    }

    public static int FirstLastDigitSum(int number) {

        int lastDigit = number % 10;
        int firstDigit = 0;

        if(number == 0) {
            return 0;
            
        } else if (number < 0) {
            return -1;
        }
        while (number > 0) {

            firstDigit = number % 10;
            number = number / 10;
        }
        return firstDigit + lastDigit;

    }
}

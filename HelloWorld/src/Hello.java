public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = ((5 * 2) / 2);
        int mySecondNumber = (12 + (9 - 7));
        int myThirdNumber = (mySecondNumber / myFirstNumber);
        int myTotal = (myFirstNumber + mySecondNumber + myThirdNumber);
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}

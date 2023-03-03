import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        while(true) {

            System.out.println("Enter number:");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int num = sc.nextInt();
                if(minimum >= num) {
                    minimum = num;
                }
                if (maximum <= num) {
                    maximum = num;
                }

                sc.nextLine();
            }
            else {
                System.out.println("Minimum = " + minimum + " Maximum = " + maximum);
                break;
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while((count <= 10)) {
            System.out.println("Enter number #" + count + ":");

            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt) {
                count++;
                int number = sc.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
            }
            sc.nextLine(); // handle end of line (enter key)
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}

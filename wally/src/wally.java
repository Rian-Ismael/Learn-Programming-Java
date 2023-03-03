import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Rian Ismael - 121210197
 */

public class wally {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            String names = sc.nextLine();
            if (names.equals("wally")) {
                break;
            }
            String[] nomeSemEspaco = names.split(" ");
            String suspeito = "?";
            for(int i = 0; i < nomeSemEspaco.length; i++) {
                if (nomeSemEspaco[i].length() == 5) {
                    suspeito = nomeSemEspaco[i];
                }
            }
            System.out.println(suspeito);
        }
    }
}
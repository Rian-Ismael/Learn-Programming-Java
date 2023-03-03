import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Rian Ismael - 121210197
 */

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operador = sc.nextLine();

        if (!operador.equals("+") && !operador.equals("-") && !operador.equals("*") && !operador.equals("/")) {
            System.out.println("ENTRADA INVALIDA");
        } else {
            double value1 = sc.nextDouble();
            double value2 = sc.nextDouble();

            if (operador.equals("/") && (value1 == 0 || value2 == 0)) {
                System.out.println("ERRO");
            } else if (operador.equals("+")) {
                System.out.println("RESULTADO: " + (value1 + value2));
            } else if (operador.equals("-")) {
                System.out.println("RESULTADO: " + (value1 - value2));
            } else if (operador.equals("*")) {
                System.out.println("RESULTADO: " + (value1 * value2));
            } else if (operador.equals("/")) {
                System.out.println("RESULTADO: " + (value1 / value2));
            } else {
                System.out.println("ENTRADA INVALIDA");
            }
        }
    }
}
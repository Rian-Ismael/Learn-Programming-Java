import java.util.ArrayList;
import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Rian Ismael - 121210197
 */

public class Alunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        int sum = 0;
        int count = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int maiorQueSete = 0;
        int menorQueSete = 0;
        ArrayList<Integer> valores = new ArrayList<>();
        while(true) {
            String notas = sc.nextLine();
            if (notas.equals("-")) {
                break;
            }
            String[] separado = notas.split(" ");
            valores.add(Integer.parseInt(separado[1]));
            count++;

        }
        for(int i = 0; i < valores.size(); i++) {
            sum += (valores.get(i));

            if (menor >= valores.get(i)) {
                menor = valores.get(i);
            } if (valores.get(i) >= maior) {
                maior = valores.get(i);
            }
            if (valores.get(i) >= 700) {
                maiorQueSete++;
            } else {
                menorQueSete++;
            }
        }
        int media = sum/count;
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media);
        System.out.println("acima: " + maiorQueSete);
        System.out.println("abaixo: " + menorQueSete);
    }
}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1180 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
        }

        int menor = x[0];
        int posicao = 0;
        for (int i = 1; i < n; i++) {
            if (x[i] < menor) {
                menor = x[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

    }

}

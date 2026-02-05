package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1184 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double[][] m = new double[12][12];

        char tipo = input.next().charAt(0);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        double soma = 0;
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (j < i) {
                    soma += m[i][j];
                    contador++;
                }
            }
        }

        if (tipo == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / contador);
        }

    }

}

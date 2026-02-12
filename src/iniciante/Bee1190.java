package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1190 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double[][] m = new double[12][12];

        char a =  input.next().charAt(0);

        int contagem = 0;
        double soma = 0.0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                m[i][j] = input.nextDouble();
                if (j > i && j > 11 - i) {
                    soma += m[i][j];
                    contagem++;
                }
            }
        }

        if (a == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / contagem);
        }

    }

}

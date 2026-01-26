package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1064 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int quantidadeValoresPositivos = 0;
        double somaValores = 0;
        for (int i = 0; i < 6; i++) {
            double valor = input.nextDouble();
            if (valor > 0) {
                quantidadeValoresPositivos += 1;
                somaValores += valor;
            }
        }

        System.out.println(quantidadeValoresPositivos + " valores positivos");
        System.out.printf("%.1f\n", (somaValores / quantidadeValoresPositivos));

    }
}

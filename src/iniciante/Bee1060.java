package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1060 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int quantidadeValoresPositivos = 0;
        for (int i = 0; i < 6; i++) {
            double valor = input.nextDouble();
            if (valor > 0) {
                quantidadeValoresPositivos += 1;
            }
        }

        System.out.println(quantidadeValoresPositivos + " valores positivos");

    }
}

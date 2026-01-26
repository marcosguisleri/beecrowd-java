package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1065 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int quantidadeValoresPares = 0;
        for (int i = 0; i < 5; i++) {
            double valor = input.nextDouble();
            if (valor % 2 == 0) {
                quantidadeValoresPares += 1;
            }
        }

        System.out.println(quantidadeValoresPares + " valores pares");

    }

}

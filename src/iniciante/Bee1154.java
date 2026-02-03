package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1154 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double soma = 0.0;
        int cont = 0;

        while (true) {

            int idade = input.nextInt();

            if (idade < 0) {
                break;
            }

            soma += idade;
            cont++;

        }

        System.out.printf("%.2f\n", (soma / cont));

    }
}


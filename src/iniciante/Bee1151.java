package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1151 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= 1) {
            System.out.print(0);
        }
        if (n >= 2) {
            System.out.print(" " + 1);
        }

        int anterior = 0;
        int atual = 1;

        for (int i = 2; i < n; i++) {
            int proximo = anterior + atual;

            System.out.print(" " + proximo);

            anterior = atual;
            atual = proximo;
        }

        System.out.println();

    }
}


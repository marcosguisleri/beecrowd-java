package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2310 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int saqueErrado = 0;
        int bloqueioErrado = 0;
        int ataqueErrado = 0;

        int saqueCerto = 0;
        int bloqueioCerto = 0;
        int ataqueCerto = 0;

        for (int i = 1; i <= n; i++) {
            String nome = input.next();

            saqueErrado += input.nextInt();
            bloqueioErrado += input.nextInt();
            ataqueErrado += input.nextInt();

            saqueCerto += input.nextInt();
            bloqueioCerto += input.nextInt();
            ataqueCerto += input.nextInt();
        }

        System.out.printf("Pontos de Saque: %.2f %%.\n", (saqueCerto * 100.0) / saqueErrado);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", (bloqueioCerto * 100.0) / bloqueioErrado);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", (ataqueCerto * 100.0) / ataqueErrado);

    }

}
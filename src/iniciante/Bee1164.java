package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1164 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int soma = 0;

        for (int i = 1; i <= n; i++) {
            int x = input.nextInt();
            for (int j = 1; j < x; j++) {
                if (x % j == 0) {
                    soma += j;
                }
            }
            if (soma == x) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
            soma = 0;
        }
    }
}


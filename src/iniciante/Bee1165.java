package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1165 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int somaDivisores = 0;

        for (int i = 1; i <= n; i++) {

            int x = input.nextInt();

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    somaDivisores++;
                }
            }

            System.out.println((somaDivisores <= 2) ? x + " eh primo" : x + " nao eh primo");

            somaDivisores = 0;
        }
    }
}


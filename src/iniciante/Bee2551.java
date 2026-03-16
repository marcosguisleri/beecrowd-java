package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2551 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();
            double recorde = -1.0;

            for (int i = 1; i <= n; i++) {
                int tempo = input.nextInt();
                int distancia = input.nextInt();

                double velocidade = (double) distancia / tempo;

                if (velocidade > recorde) {
                    recorde = velocidade;
                    System.out.println(i);
                }
            }
        }

    }

}
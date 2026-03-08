package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2140 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int[] notas = {2, 5, 10, 20, 50, 100};

        while (true) {

            int n = input.nextInt();
            int m = input.nextInt();

            if (n == 0 && m == 0) break;

            int troco = m - n;
            boolean possivel = false;

            for (int i = 0; i < notas.length; i++) {
                for (int j = 0; j < notas.length; j++) {
                    if (notas[i] + notas[j] == troco) {
                        possivel = true;
                        break;
                    }
                }
                if (possivel) break;
            }

            if (possivel) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
        }

    }

}

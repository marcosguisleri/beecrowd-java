package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1435 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (true) {

            int x =  input.nextInt();

            if (x == 0) break;

            for (int i = 0; i < x; i++) {
                StringBuilder line = new StringBuilder();

                for (int j = 0; j < x; j++) {
                    int topo = i;
                    int esquerda = j;
                    int baixo = x - 1 - i;
                    int direita = x - 1 - j;

                    int val = 1 + Math.min(Math.min(topo, baixo), Math.min(esquerda, direita));

                    if (j > 0) line.append(" ");
                    line.append(String.format("%3d", val));
                }

                System.out.println(line);
            }

            System.out.println();

        }

    }

}

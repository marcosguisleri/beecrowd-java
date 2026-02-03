package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1160 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {

            int pa = input.nextInt();
            int pb = input.nextInt();
            double g1 = input.nextDouble();
            double g2 = input.nextDouble();

            int anos = 0;

            while (pa <= pb && anos <= 100) {
                pa += (int) (pa * (g1 / 100.0));
                pb += (int) (pb * (g2 / 100.0));
                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }

        }

    }
}


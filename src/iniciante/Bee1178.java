package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1178 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        double[] n = new double[100];

        double x = input.nextDouble();

        n[0] = x;

        for (int i = 1; i < 100; i++) {
            n[i] = n[i-1] / 2;
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }

    }

}

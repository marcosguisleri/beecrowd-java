package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1174 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        double[] a = new double[100];

        for (int i = 0; i < 100; i++) {
            a[i] = input.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (a[i] <= 10) {
                System.out.printf("A[" + i + "] = %.1f\n", a[i]);
            }
        }

    }

}

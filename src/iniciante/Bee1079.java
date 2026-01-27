package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1079 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            double n1 = input.nextDouble();
            double n2 = input.nextDouble();
            double n3 = input.nextDouble();

            System.out.printf("%.1f\n", (((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10));

        }

    }
}


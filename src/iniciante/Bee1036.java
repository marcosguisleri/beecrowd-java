package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1036 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Impossivel calcular");
            } else {
                double delta1 = (-b + Math.sqrt(delta)) / (2 * a);
                double delta2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("R1 = %.5f\n", delta1);
                System.out.printf("R2 = %.5f\n", delta2);
            }
        }

    }

}

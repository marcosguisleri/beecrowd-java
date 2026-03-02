package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2029 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double altura = 0.0;
        double area = 0.0;

        while (input.hasNextDouble()) {

            double v = input.nextDouble();
            double d = input.nextDouble();

            altura = v / (3.14 * (d/2) * (d/2));
            area = 3.14 * (d/2) * (d/2);

            System.out.printf("ALTURA = %.2f\n", altura);
            System.out.printf("AREA = %.2f\n", area);

        }

    }

}
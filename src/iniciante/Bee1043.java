package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1043 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        } else {
            System.out.printf("Area = %.1f\n", ((a + b) * c / 2));
        }

    }

}

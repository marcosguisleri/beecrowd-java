package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1012 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(c, 2)));
        System.out.printf("TRAPEZIO: %.3f\n", (((a + b) * c) / 2));
        System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
        System.out.printf("RETANGULO: %.3f\n", (a * b));

    }

}

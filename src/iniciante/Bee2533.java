package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2533 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int x = input.nextInt();
            int numerador = 0;
            int denominador = 0;

            for (int i = 0; i < x; i++) {
                int n1 = input.nextInt();
                int n2 = input.nextInt();

                numerador += n1 * n2;
                denominador += n2;
            }
            double resultado = (double) numerador / (denominador* 100);
            System.out.printf("%.4f\n", resultado);
        }

    }

}
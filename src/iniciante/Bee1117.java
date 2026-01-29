package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1117 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = input.nextDouble();
        }

        double nota2 = input.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = input.nextDouble();
        }

        System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);

    }
}

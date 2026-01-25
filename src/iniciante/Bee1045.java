package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Bee1045 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double[] lista = {a, b, c};
        Arrays.sort(lista);
        double A = lista[2];
        double B = lista[1];
        double C = lista[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        double A2 = A * A;
        double B2 = B * B;
        double C2 = C * C;

        if(A2 == B2 + C2) {
            System.out.println("TRIANGULO RETANGULO");
        } else if(A2 > B2 + C2) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if(A2 < B2 + C2) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A == B && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int codigoPeca1, codigoPeca2;
        int numeroPecas1, numeroPecas2;
        double valorPeca1, valorPeca2;

        codigoPeca1 = input.nextInt();
        numeroPecas1 = input.nextInt();
        valorPeca1 = input.nextDouble();

        codigoPeca2 = input.nextInt();
        numeroPecas2 = input.nextInt();
        valorPeca2 = input.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (valorPeca1 * numeroPecas1) + (valorPeca2 * numeroPecas2));

    }

}

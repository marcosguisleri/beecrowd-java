package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1071 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int count = 0;

        int a = input.nextInt();
        int b = input.nextInt();

        int maior = Math.max(a, b);
        int menor = Math.min(a, b);

        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);

    }

}

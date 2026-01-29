package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1101 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int m =  input.nextInt();
        int n = input.nextInt();

        int soma = 0;

        while(m > 0 && n > 0) {

            int maior = Math.max(m, n);
            int menor = Math.min(m, n);

            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }

            System.out.println("Sum=" + soma);

            m =  input.nextInt();
            n = input.nextInt();
            soma = 0;
        }
    }
}




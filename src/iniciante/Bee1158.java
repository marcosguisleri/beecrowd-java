package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1158 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {

            int x =  input.nextInt();
            int y = input.nextInt();

            if (x % 2 == 0) {
                x++;
            }

            for (int j = 0; j < y; j++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);

            soma = 0;
        }

    }
}


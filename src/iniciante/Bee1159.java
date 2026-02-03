package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1159 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int soma = 0;

        while (x != 0) {

            if (x % 2 != 0) {
                x++;
            }

            for (int i = 0; i < 5; i++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);

            soma = 0;

            x = input.nextInt();

        }

    }
}


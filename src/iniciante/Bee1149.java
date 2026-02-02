package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1149 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int n = input.nextInt();
        while (n <= 0) {
            n = input.nextInt();
        }

        int soma = 0;
        for (int i = 0; i <= n-1; i++) {
            int j = a + i;
            soma += j;
        }

        System.out.println(soma);
    }
}


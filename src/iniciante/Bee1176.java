package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1176 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            long resultado = fibonacci(n);
            System.out.println("Fib(" + n + ") = " + resultado);
        }

    }

    public static long fibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;


        long anterior = 0;
        long atual = 1;

        for (int i = 2; i <= n; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual;
    }

}

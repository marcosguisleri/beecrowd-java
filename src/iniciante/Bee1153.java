package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1153 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println(fatorial);

    }
}


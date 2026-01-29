package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1144 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {

            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
            System.out.println(i + " " + (quadrado + 1) + " " + (cubo + 1));

        }

    }
}

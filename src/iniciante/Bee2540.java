package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2540 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int contador = 0;
            int n = input.nextInt();

            double doisTercos = (n * 2.0) / 3.0;

            for (int i = 1; i <= n; i++) {
                int voto = input.nextInt();
                if (voto == 1) contador++;
            }

            System.out.println((contador >= doisTercos) ? "impeachment" : "acusacao arquivada");
        }

    }

}
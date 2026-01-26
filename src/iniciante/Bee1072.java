package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1072 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int n = input.nextInt();

        int numerosDentro = 0;
        int numerosFora = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x >= 10 && x <= 20) {
                numerosDentro++;
            } else {
                numerosFora++;
            }
        }
        System.out.println(numerosDentro + " in");
        System.out.println(numerosFora + " out");

    }

}

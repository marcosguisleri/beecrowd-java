package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1789 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {

            int l = input.nextInt();

            int[] v =  new int[l];

            int maior = 0;
            for (int i = 0; i < l; i++) {
                v[i] = input.nextInt();
                maior = Math.max(maior, v[i]);
            }

            if (maior < 10) {
                System.out.println("1");
            } else if (maior < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }

        }

    }

}

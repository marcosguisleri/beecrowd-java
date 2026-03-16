package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2547 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();
            int min = input.nextInt();
            int max = input.nextInt();

            int cont = 0;
            for (int i = 0; i < n; i++) {
                int altura = input.nextInt();
                if (altura >= min && altura <= max) {
                    cont++;
                }
            }
            System.out.println(cont);
        }

    }

}
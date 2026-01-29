package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1116 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", ((double) x / y));
            }
        }

    }
}




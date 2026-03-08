package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1478 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int v = Math.abs(i - j) + 1;

                    if (j > 0) System.out.print(" ");
                    System.out.printf("%3d", v);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

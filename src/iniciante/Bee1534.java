package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1534 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (i + j == n - 1) {
                        System.out.print(2);
                    } else if (i == j) {
                        System.out.print(1);
                    } else {
                        System.out.print(3);
                    }
                }
                System.out.println();
            }
        }

    }

}

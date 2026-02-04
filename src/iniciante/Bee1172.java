package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1172 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            int a = input.nextInt();

            if (a <= 0) {
                x[i] = 1;
            } else {
                x[i] = a;
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println("X[" + i + "] = " + x[i]);
        }

    }
}


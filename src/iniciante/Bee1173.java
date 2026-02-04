package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1173 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] n = new int[10];

        int x = input.nextInt();

        n[0] = x;

        for (int i = 1; i < 10; i++) {
            x *= 2;
            n[i] = x;
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("N[" + j + "] = " + n[j]);
        }

    }
}


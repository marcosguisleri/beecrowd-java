package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1145 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.print(i);

            if (i % x != 0 && i != y) { System.out.print(" "); }

            if (i % x == 0) { System.out.println(); } }

        }
    }


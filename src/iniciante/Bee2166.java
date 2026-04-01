package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2166 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        double frac = 0.0;

        for (int i = 1; i <= x; i++) {
            frac = 1.0 / (2.0 + frac);
        }

        frac = 1.0 + frac;

        System.out.printf("%.10f%n", frac);

    }

}
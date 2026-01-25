package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1006 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a, b, c;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

    }

}

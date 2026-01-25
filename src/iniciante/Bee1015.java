package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double x1, y1, x2, y2;

        x1 = input.nextDouble();
        y1 = input.nextDouble();

        x2 = input.nextDouble();
        y2 = input.nextDouble();

        System.out.printf("%.4f\n", (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2))));

    }

}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1963 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();

        System.out.printf("%.2f%%", ((b - a) / 100) * a);

    }

}
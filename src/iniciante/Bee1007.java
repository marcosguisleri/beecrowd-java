package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1007 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        System.out.println("DIFERENCA = " + (a * b - c * d));

    }

}

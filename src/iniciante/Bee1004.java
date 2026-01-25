package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1004 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a, b;

        a = input.nextInt();
        b = input.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);

    }

}

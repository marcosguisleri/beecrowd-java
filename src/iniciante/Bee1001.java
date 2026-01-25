package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1001 {

    public static void main(String[] args) throws IOException {

        int a, b;

        Scanner leitor = new Scanner(System.in);

        a = leitor.nextInt();
        b = leitor.nextInt();

        int x = a + b;

        System.out.println("X = " + x);

    }

}

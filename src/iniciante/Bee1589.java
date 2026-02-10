package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1589 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();

        for (int i = 1; i <= n; i++) {

            int r1 = input.nextInt();
            int r2 = input.nextInt();

            System.out.println(r1 + r2);

        }

    }

}

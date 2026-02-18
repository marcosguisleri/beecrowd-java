package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1866 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 0; i < x; i++) {
            int n =  input.nextInt();

            if (n % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

    }

}

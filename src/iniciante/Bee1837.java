package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1837 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int q = a / b;
        int r = a % b;

        if (r < 0) {
            r += Math.abs(b);
            q -= (b > 0 ? 1 : -1);
        }

        System.out.println(q + " " + r);

    }

}

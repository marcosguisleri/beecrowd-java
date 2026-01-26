package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1059 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

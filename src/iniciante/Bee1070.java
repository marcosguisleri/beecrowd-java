package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1070 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int x = input.nextInt();
        int cont = 0;

        if (x % 2 == 0) {
            x++;
        }

        for (int i = x; cont < 6; i += 2) {
            System.out.println(i);
            cont++;
        }
    }

}

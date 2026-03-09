package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2167 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int anterior = input.nextInt();
        boolean queda = false;

        for (int i = 2; i <= n; i++) {
            int x = input.nextInt();
            if (x < anterior) {
                System.out.println(i);
                queda = true;
                break;
            }
            anterior = x;
        }

        if (!queda) {
            System.out.println(0);
        }

    }

}
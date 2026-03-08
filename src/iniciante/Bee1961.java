package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1961 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int n = input.nextInt();

        for (int i = 0; i < n/2; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            if (Math.max(a,b) - Math.min(a, b) > p) {
                System.out.println("GAME OVER");
                System.exit(0);
            }
        }

        System.out.println("YOU WIN");

    }

}
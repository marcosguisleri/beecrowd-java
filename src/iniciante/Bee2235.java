package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2235 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b || b == c || c == a) {
            System.out.println("S");
        } else if (a + b == c || a + c == b || b + c == a) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

}

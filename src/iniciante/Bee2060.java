package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2060 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        int total5 = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();

            if (x % 2 == 0) {
                total2++;
            }

            if (x % 3 == 0) {
                total3++;
            }

            if (x % 4 == 0) {
                total4++;
            }

            if (x % 5 == 0) {
                total5++;
            }
        }

        System.out.println(total2 + " Multiplo(s) de 2");
        System.out.println(total3 + " Multiplo(s) de 3");
        System.out.println(total4 + " Multiplo(s) de 4");
        System.out.println(total5 + " Multiplo(s) de 5");

    }

}
package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1759 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.print("Ho!\n");
            } else {
                System.out.print("Ho ");
            }
        }

    }

}

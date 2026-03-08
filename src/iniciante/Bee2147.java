package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2147 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        input.nextLine();
        for (int i = 0; i < n; i++) {
            String galopeira = input.nextLine();
            double segundos = (double) galopeira.length() / 100;
            System.out.printf("%.2f\n", segundos);
        }
    }

}

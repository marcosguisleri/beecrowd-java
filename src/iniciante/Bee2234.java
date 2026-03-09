package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2234 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.printf("%.2f\n", (double) n1 / n2);

    }

}
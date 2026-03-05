package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2146 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();
            System.out.println(n - 1);
        }

    }

}
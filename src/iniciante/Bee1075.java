package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1075 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for  (int i = 1; i <= 10000; i++) {
            if(i % n == 2) {
                System.out.println(i);
            }
        }

    }
}

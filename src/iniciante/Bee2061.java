package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2061 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 0; i < m; i++) {
            String acao = input.next();
            if (acao.equals("fechou")) {
                n += 1;
            } else {
                n -= 1;
            }
        }

        System.out.println(n);

    }

}
package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1099 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n =  input.nextInt();

        int somaImpares = 0;

        for (int i = 0; i < n; i++) {
            int x =  input.nextInt();
            int y =  input.nextInt();

            int maior = Math.max(x, y);
            int menor = Math.min(x, y);

            for (int j = menor+1; j < maior; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }

            System.out.println(somaImpares);

            somaImpares = 0;
        }


    }
}




package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1133 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int x =  input.nextInt();
        int y =  input.nextInt();

        int maior = Math.max(x,y);
        int menor = Math.min(x,y);

        for (int i = menor+1; i < maior; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

    }

}


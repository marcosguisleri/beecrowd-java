package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1142 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int x =  input.nextInt();
        int cont = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(cont + " ");
                cont++;
            }
            System.out.print("PUM\n");
            cont++;
        }

    }

}


package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1865 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 0; i < x; i++) {
            String nome =  input.next();
            int forca = input.nextInt();

            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }

    }

}

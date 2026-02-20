package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2006 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int t =  input.nextInt();

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            int x =  input.nextInt();
            if (t == x) {
                contador++;
            }
        }

        System.out.println(contador);

    }

}
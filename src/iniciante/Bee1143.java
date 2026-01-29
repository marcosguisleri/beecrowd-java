package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1143 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int n =  input.nextInt();

        for (int i = 1; i <= n; i++) {

            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);

        }

    }

}



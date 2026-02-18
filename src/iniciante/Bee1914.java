package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1914 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 0; i < x; i++) {
            String nome1 =  input.next();
            String escolha1 = input.next();
            String nome2 =  input.next();
            String escolha2 = input.next();

            int valor1 = input.nextInt();
            int valor2 = input.nextInt();

            if ((valor1 + valor2) % 2 == 0) {
                if (escolha1.equals("PAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            } else {
                if (escolha1.equals("IMPAR")) {
                    System.out.println(nome1);
                } else {
                    System.out.println(nome2);
                }
            }
        }

    }

}

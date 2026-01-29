package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1080 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] valores = new int[100];
        for (int i = 0; i < 100; i++) {
            valores[i] = input.nextInt();
        }

        int maior = valores[0];
        int indice = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                indice = i+1;
            }
        }

        System.out.println(maior);
        System.out.println(indice);

    }
}



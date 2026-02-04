package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1177 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int[] vetor = new int[1000];

        int x = input.nextInt();

        int[] vetorRepetidos = new int[x];

        for (int i = 0; i < vetorRepetidos.length; i++) {
            vetorRepetidos[i] = i;
        }

        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetorRepetidos[j];
            j++;
            if (j == vetorRepetidos.length) {
                j = 0;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("N[" + i + "] = " + vetor[i]);
        }

    }

}

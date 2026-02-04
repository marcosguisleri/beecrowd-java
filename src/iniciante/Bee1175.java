package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1175 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = input.nextInt();
        }

        int[] vetorAuxiliar = new int[20];

        for (int i = 19; i >= 0; i--) {
            vetorAuxiliar[19 - i] = n[i];
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + vetorAuxiliar[i]);
        }

    }

}

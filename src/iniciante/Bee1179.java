package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1179 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 15; i++) {
            int valor = input.nextInt();

            if (valor % 2 == 0) {
                vetorPar[contadorPar] = valor;
                contadorPar++;

                if (contadorPar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + vetorPar[j]);
                    }
                    contadorPar = 0;
                }

            } else {
                vetorImpar[contadorImpar] = valor;
                contadorImpar++;

                if (contadorImpar == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + vetorImpar[j]);
                    }
                    contadorImpar = 0;
                }
            }
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.println("impar[" + i + "] = " + vetorImpar[i]);
        }

        for (int i = 0; i < contadorPar; i++) {
            System.out.println("par[" + i + "] = " + vetorPar[i]);
        }

    }

}

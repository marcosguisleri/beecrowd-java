package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1066 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int somaPar = 0;
        int somaImpar = 0;
        int somaPositivos = 0;
        int somaNegativo = 0;
        for (int i = 0; i < 5; i++) {
            int valor = input.nextInt();
            if (valor % 2 == 0 ) {
                somaPar++;
            } else {
                somaImpar++;
            }
            if (valor > 0) {
                somaPositivos++;
            } else if (valor < 0){
                somaNegativo++;
            }
        }

        System.out.println(somaPar + " valor(es) par(es)");
        System.out.println(somaImpar + " valor(es) impar(es)");
        System.out.println(somaPositivos + " valor(es) positivo(s)");
        System.out.println(somaNegativo + " valor(es) negativo(s)");

    }

}

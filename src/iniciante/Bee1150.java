package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1150 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x =  input.nextInt();
        int z =  input.nextInt();
        while (z <= x) {
            z =  input.nextInt();
        }

        int soma = 0;
        int contador = 0;
        int numeroAtual = x;

        while (soma <= z) {
            soma += numeroAtual;
            contador++;
            numeroAtual++;
        }
        System.out.println(contador);
    }
}


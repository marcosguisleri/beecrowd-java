package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2542 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {

            int N = input.nextInt();
            int M = input.nextInt();
            int L = input.nextInt();

            int[][] baralhoMarcos = new int[M][N];
            int[][] baralhoLeonardo = new int[L][N];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    baralhoMarcos[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < N; j++) {
                    baralhoLeonardo[i][j] = input.nextInt();
                }
            }

            int Cm = input.nextInt();
            int Cl = input.nextInt();

            int A = input.nextInt();

            int atributoMarcos = baralhoMarcos[Cm - 1][A - 1];
            int atributoLeonardo = baralhoLeonardo[Cl - 1][A - 1];

            if (atributoMarcos > atributoLeonardo) {
                System.out.println("Marcos");
            } else if (atributoLeonardo > atributoMarcos) {
                System.out.println("Leonardo");
            } else {
                System.out.println("Empate");
            }
        }

    }

}
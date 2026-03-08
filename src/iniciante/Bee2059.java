package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2059 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int j1 = input.nextInt();
        int j2 = input.nextInt();
        int r = input.nextInt();
        int a = input.nextInt();

        if (r == 1 && a == 1) {
            System.out.println("Jogador 2 ganha!");
            return;
        }
        if (r == 1 && a == 0) {
            System.out.println("Jogador 1 ganha!");
            return;
        }
        if (r == 0 && a == 1) {
            System.out.println("Jogador 1 ganha!");
            return;
        }

        int soma = j1 + j2;
        boolean par = (soma % 2 == 0);

        if ((p == 1 && par) || (p == 0 && !par)) {
            System.out.println("Jogador 1 ganha!");
        } else {
            System.out.println("Jogador 2 ganha!");
        }

    }

}
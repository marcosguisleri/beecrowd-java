package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2172 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int xVezes = input.nextInt();
        int xpAtual = input.nextInt();

        while (xVezes != 0 || xpAtual != 0) {

            System.out.println((xVezes * xpAtual));

            xVezes = input.nextInt();
            xpAtual = input.nextInt();

        }

    }

}
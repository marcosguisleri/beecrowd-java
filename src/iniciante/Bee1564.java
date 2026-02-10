package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1564 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            int reclamacoes = input.nextInt();

            System.out.println((reclamacoes > 0) ? "vai ter duas!" : "vai ter copa!");

        }

    }

}

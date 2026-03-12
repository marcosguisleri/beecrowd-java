package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2543 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()){

            int qtdVideos = input.nextInt();
            int ra = input.nextInt();

            int contador = 0;
            for (int i = 1; i <= qtdVideos; i++) {
                int raVideo = input.nextInt();
                int jogo = input.nextInt();

                if (raVideo == ra && jogo == 0) {
                    contador++;
                }
            }

            System.out.println(contador);

        }

    }

}
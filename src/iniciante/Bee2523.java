package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2523 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            String lampadas = input.next();
            int n = input.nextInt();

            StringBuilder mensagem = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                int x = input.nextInt();
                mensagem.append(lampadas.charAt(x - 1));
            }

            System.out.println(mensagem.toString());

        }

        input.close();

    }

}
package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2003 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String horario = input.nextLine();
            String[] partes = horario.split(":");
            int h = Integer.parseInt(partes[0]);
            int m = Integer.parseInt(partes[1]);

            int minutosTotais = h * 60 + m;
            int encontro = 8 * 60;
            int chegada = minutosTotais + 60;

            if (chegada <= encontro) {
                System.out.println("Atraso maximo: 0");
            } else {
                System.out.println("Atraso maximo: " + (chegada - encontro));
            }

        }

    }

}
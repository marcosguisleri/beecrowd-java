package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2152 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            int h = input.nextInt();
            int m = input.nextInt();
            int o = input.nextInt();

            String hora = null;
            String minuto = null;

            if (h < 10) {
                hora = "0" + h;
            } else {
                hora = h + "";
            }

            if (m < 10) {
                minuto = "0" + m;
            } else {
                minuto = m + "";
            }

            String dataHora = String.format("%02d:%02d", h, m);

            if (o == 1) {
                System.out.println(dataHora + " - " + "A porta abriu!");
            } else {
                System.out.println(dataHora + " - " + "A porta fechou!");
            }

        }

    }

}
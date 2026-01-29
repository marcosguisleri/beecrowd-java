package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1134 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int x = 0;

        int quantAlcool = 0;
        int quantGasolina = 0;
        int quantDiesel = 0;

        while (x != 4) {

            x = input.nextInt();
            while (x < 1 || x > 4) {
                x = input.nextInt();
            }

            if (x == 1) {
                quantAlcool++;
            } else if (x == 2) {
                quantGasolina++;
            } else if (x == 3) {
                quantDiesel++;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Diesel: " + quantDiesel);

    }

}


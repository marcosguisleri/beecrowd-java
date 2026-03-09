package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2221 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int valorDabriel = 0;
        int valorGuarte = 0;

        for (int i = 0; i < t; i++) {

            int bonus = input.nextInt();

            int dabriel1 = input.nextInt();
            int dabriel2 = input.nextInt();
            int dabriel3 = input.nextInt();

            int guarte1 = input.nextInt();
            int guarte2 = input.nextInt();
            int guarte3 = input.nextInt();

            valorDabriel = (dabriel1 + dabriel2) / 2;
            if (dabriel3 % 2 == 0) {
                valorDabriel += bonus;
            }

            valorGuarte = (guarte1 + guarte2) / 2;
            if (guarte3 % 2 == 0) {
                valorGuarte += bonus;
            }

            if (valorDabriel == valorGuarte) {
                System.out.println("Empate");
            } else if (valorDabriel > valorGuarte) {
                System.out.println("Dabriel");
            } else {
                System.out.println("Guarte");
            }

        }

    }

}
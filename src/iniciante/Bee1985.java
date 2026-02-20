package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1985 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        double total = 0.0;

        for (int i = 0; i < p; i++) {
            int cod = input.nextInt();
            int qtd = input.nextInt();

            switch (cod) {
                case 1001 -> total += qtd * 1.50;
                case 1002 -> total += qtd * 2.50;
                case 1003 -> total += qtd * 3.50;
                case 1004 -> total += qtd * 4.50;
                case 1005 -> total += qtd * 5.50;
            }
        }

        System.out.printf("%.2f%n", total);

    }

}
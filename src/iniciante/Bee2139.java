package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2139 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int[] diasNoMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diaDoNatal = 360;

        while (input.hasNextInt()) {

            int mes = input.nextInt();
            int dia = input.nextInt();

            int diaDoAno = dia;
            for (int i = 0; i < mes - 1; i++) {
                diaDoAno += diasNoMes[i];
            }

            if (diaDoAno == diaDoNatal) {
                System.out.println("E natal!");
            } else if (diaDoAno == diaDoNatal - 1) {
                System.out.println("E vespera de natal!");
            } else if (diaDoAno > diaDoNatal) {
                System.out.println("Ja passou!");
            } else {
                System.out.println("Faltam " + (diaDoNatal - diaDoAno) + " dias para o natal!");
            }
        }

    }

}
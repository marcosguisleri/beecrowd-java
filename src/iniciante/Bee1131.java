package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1131 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int flag = 1;

        int quantGrenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int quantEmpates = 0;

        while (flag == 1) {

            int golsInter = input.nextInt();
            int golsGremio = input.nextInt();

            if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else if (golsInter > golsGremio) {
                vitoriasInter++;
            } else {
                quantEmpates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            flag = input.nextInt();
            while (flag < 1 || flag > 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                flag = input.nextInt();
            }

            quantGrenais++;

        }

        System.out.println(quantGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + quantEmpates);

        if (vitoriasGremio > vitoriasInter &&  vitoriasGremio > quantEmpates) {
            System.out.println("Gremio venceu mais");
        } else if (vitoriasInter > vitoriasGremio && vitoriasInter > quantEmpates) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

    }

}

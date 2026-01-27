package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1094 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;
        for (int i = 0; i < n; i++) {
            int quantia = input.nextInt();
            String tipo = input.next();

            if (tipo.equals("C")) {
                totalCobaias += quantia;
                totalCoelhos += quantia;
            } else if (tipo.equals("R")) {
                totalRatos += quantia;
                totalCobaias += quantia;
            } else {
                totalSapos += quantia;
                totalCobaias += quantia;
            }
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", (((double) totalCoelhos/totalCobaias) * 100.0));
        System.out.printf("Percentual de ratos: %.2f %%\n", (((double) totalRatos/totalCobaias) * 100.0));
        System.out.printf("Percentual de sapos: %.2f %%\n", (((double) totalSapos/totalCobaias) * 100.0));

    }
}




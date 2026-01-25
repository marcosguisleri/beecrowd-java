package iniciante;

import java.util.Scanner;

public class Bee1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        int centavos = (int) Math.round(valor * 100);

        System.out.println("NOTAS:");
        int notas100 = centavos / 10000;
        centavos %= 10000;
        System.out.println(notas100 + " nota(s) de R$ 100.00");

        int notas50 = centavos / 5000;
        centavos %= 5000;
        System.out.println(notas50 + " nota(s) de R$ 50.00");

        int notas20 = centavos / 2000;
        centavos %= 2000;
        System.out.println(notas20 + " nota(s) de R$ 20.00");

        int notas10 = centavos / 1000;
        centavos %= 1000;
        System.out.println(notas10 + " nota(s) de R$ 10.00");

        int notas5 = centavos / 500;
        centavos %= 500;
        System.out.println(notas5 + " nota(s) de R$ 5.00");

        int notas2 = centavos / 200;
        centavos %= 200;
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        int moedas1 = centavos / 100;
        centavos %= 100;
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");

        int moedas050 = centavos / 50;
        centavos %= 50;
        System.out.println(moedas050 + " moeda(s) de R$ 0.50");

        int moedas025 = centavos / 25;
        centavos %= 25;
        System.out.println(moedas025 + " moeda(s) de R$ 0.25");

        int moedas010 = centavos / 10;
        centavos %= 10;
        System.out.println(moedas010 + " moeda(s) de R$ 0.10");

        int moedas005 = centavos / 5;
        centavos %= 5;
        System.out.println(moedas005 + " moeda(s) de R$ 0.05");

        int moedas001 = centavos;
        System.out.println(moedas001 + " moeda(s) de R$ 0.01");
    }

}

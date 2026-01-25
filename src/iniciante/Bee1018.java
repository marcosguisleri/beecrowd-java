package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1018 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.println(n);

        int notasDe100 = n / 100;
        int sobraDe100 = n % 100;

        int notasDe50 = sobraDe100 / 50;
        int sobraDe50 = sobraDe100 % 50;

        int notasDe20 = sobraDe50 / 20;
        int sobraDe20 = sobraDe50 % 20;

        int notasDe10 = sobraDe20 / 10;
        int sobraDe10 = sobraDe20 % 10;

        int notasDe5 = sobraDe10 / 5;
        int sobraDe5 = sobraDe10 % 5;

        int notasDe2 = sobraDe5 / 2;
        int sobraDe2 = sobraDe5 % 2;

        int notasDe1 = sobraDe2 / 1;

        System.out.println(notasDe100 + " nota(s) de R$ 100,00");
        System.out.println(notasDe50 + " nota(s) de R$ 50,00");
        System.out.println(notasDe20 + " nota(s) de R$ 20,00");
        System.out.println(notasDe10 + " nota(s) de R$ 10,00");
        System.out.println(notasDe5 + " nota(s) de R$ 5,00");
        System.out.println(notasDe2 + " nota(s) de R$ 2,00");
        System.out.println(notasDe1 + " nota(s) de R$ 1,00");

    }

}

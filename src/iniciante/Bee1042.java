package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bee1042 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] numeros = {a,b,c};

        Arrays.sort(numeros);

        for (int i : numeros) {
            System.out.println(i);
        }

        System.out.println("\n" + a);
        System.out.println(b);
        System.out.println(c);

    }

}

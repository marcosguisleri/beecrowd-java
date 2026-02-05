package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1182 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double[][] m = new double[12][12];

        int l = input.nextInt();
        char t = input.next().charAt(0);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        double soma = 0;
        for (int j = 0; j < 12; j++) {
            soma += m[j][l];
        }

        if (t == 'S') {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma/12);
        }

    }

}

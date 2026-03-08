package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1963 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();

        double porcentagem = (b - a) / a * 100;

        System.out.printf("%.2f%%\n", porcentagem);

    }

}

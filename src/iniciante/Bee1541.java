package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1541 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (true) {

            int a = input.nextInt();

            if (a == 0) {
                break;
            }

            int b = input.nextInt();
            int c = input.nextInt();

            int areaCasa = a * b;

            double areaTerreno = (areaCasa * 100.0) / c;

            int lado = (int) Math.sqrt(areaTerreno);

            System.out.println(lado);

        }

    }

}

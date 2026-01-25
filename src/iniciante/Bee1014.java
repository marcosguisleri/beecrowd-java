package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int totalKm;
        double totalGasolina;

        totalKm = input.nextInt();
        totalGasolina = input.nextDouble();

        System.out.printf("%.3f km/l\n", (totalKm / totalGasolina));

    }

}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String name;
        double fixedSalary;
        double totalSales;

        name = input.nextLine();
        fixedSalary = input.nextDouble();
        totalSales = input.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", (fixedSalary + (totalSales * 0.15)));

    }

}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int number, hours;
        double salary;

        number = input.nextInt();
        hours = input.nextInt();
        salary = input.nextDouble();

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", (hours * salary));

    }

}

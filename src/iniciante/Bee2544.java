package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2544 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int a = input.nextInt();
            int resultado = (int) (Math.log(a) / Math.log(2));
            System.out.println(resultado);
        }

    }

}
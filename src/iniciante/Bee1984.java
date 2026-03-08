package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1984 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        long numero = input.nextLong();

        String numeroInvertido = new StringBuilder().append(numero).reverse().toString();
        long invertido = Long.parseLong(numeroInvertido);

        System.out.println(numeroInvertido);

    }

}
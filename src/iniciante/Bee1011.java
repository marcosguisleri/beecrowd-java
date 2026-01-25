package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double raio;

        raio  = input.nextDouble();

        System.out.printf("VOLUME = %.3f\n", ((4/3.0) * pi * Math.pow(raio, 3)));
    }

}

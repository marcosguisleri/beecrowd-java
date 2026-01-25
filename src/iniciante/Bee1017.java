package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1017 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int tempoGasto = input.nextInt();
        int velocidadeMedia =  input.nextInt();

        System.out.printf("%.3f\n", ((tempoGasto * velocidadeMedia) / 12.0));

    }

}

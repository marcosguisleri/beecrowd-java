package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2057 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int t = input.nextInt();
        int f = input.nextInt();

        int horaFinal = s + t + f;
        horaFinal = ((horaFinal % 24) + 24) % 24;

        System.out.println(horaFinal);

    }

}
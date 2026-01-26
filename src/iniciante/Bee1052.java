package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1052 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        String[] meses = { "January", "February", "March", "April",
                "May", "June", "July", "August",  "September",  "October", "November", "December" };

        int mes = input.nextInt();

        IO.println(meses[mes-1]);

    }
}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2165 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String frase = input.nextLine();

        System.out.println((frase.length() <= 140) ? "TWEET" : "MUTE");

    }

}

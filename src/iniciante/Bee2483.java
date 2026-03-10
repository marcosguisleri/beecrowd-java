package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2483 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String mensagem = "Feliz natal!";
        int x = input.nextInt();

        String resultado = "Feliz nat" + "a".repeat(x) + "l!";
        System.out.println(resultado);

    }

}
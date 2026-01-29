package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1114 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        boolean flag = false;

        do {
            int senha = input.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                flag = true;
            } else {
                System.out.println("Senha Invalida");
            }
        } while (!flag);

    }
}




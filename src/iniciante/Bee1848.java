package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bee1848 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int gritos = 0;
        int soma = 0;

        while (gritos < 3) {
            String linha = br.readLine();

            if (linha.equals("caw caw")) {
                System.out.println(soma);
                soma = 0;
                gritos++;
            } else {
                int valor = 0;

                if (linha.charAt(0) == '*') valor += 4;
                if (linha.charAt(1) == '*') valor += 2;
                if (linha.charAt(2) == '*') valor += 1;

                soma += valor;
            }
        }

    }

}

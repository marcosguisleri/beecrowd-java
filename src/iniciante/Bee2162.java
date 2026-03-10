package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bee2162 {

    public static void main(String[] args) throws IOException {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        int quantidadeMedidas = Integer.parseInt(leitor.readLine().trim());
        StringTokenizer tokens = new StringTokenizer(leitor.readLine());

        int alturaAnterior = Integer.parseInt(tokens.nextToken());

        int sinalAnterior = 0;

        for (int i = 1; i < quantidadeMedidas; i++) {
            int alturaAtual = Integer.parseInt(tokens.nextToken());
            int diferenca = alturaAtual - alturaAnterior;

            if (diferenca == 0) {
                System.out.println(0);
                return;
            }

            int sinalAtual = (diferenca > 0) ? 1 : -1;

            if (sinalAnterior != 0 && sinalAtual == sinalAnterior) {
                System.out.println(0);
                return;
            }

            sinalAnterior = sinalAtual;
            alturaAnterior = alturaAtual;
        }

        System.out.println(1);

    }

}
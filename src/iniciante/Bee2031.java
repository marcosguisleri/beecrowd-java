package iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee2031 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        Map<String, String> resultado = new HashMap<>();

        resultado.put("ataque:ataque", "Aniquilacao mutua");
        resultado.put("papel:papel", "Ambos venceram");
        resultado.put("pedra:pedra", "Sem ganhador");

        resultado.put("ataque:pedra", "Jogador 1 venceu");
        resultado.put("pedra:ataque", "Jogador 2 venceu");

        resultado.put("pedra:papel", "Jogador 1 venceu");
        resultado.put("papel:pedra", "Jogador 2 venceu");

        resultado.put("ataque:papel", "Jogador 1 venceu");
        resultado.put("papel:ataque", "Jogador 2 venceu");

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String j1 = input.next();
            String j2 = input.next();

            String chave = j1 + ":" + j2;
            System.out.println(resultado.get(chave));
        }

    }

}
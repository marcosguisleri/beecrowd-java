package iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Bee1828 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        input.nextLine();

        Map<String, Set<String>> regras = new HashMap<>();
        regras.put("tesoura", Set.of("papel", "lagarto"));
        regras.put("papel", Set.of("pedra", "Spock"));
        regras.put("pedra", Set.of("lagarto", "tesoura"));
        regras.put("lagarto", Set.of("Spock", "papel"));
        regras.put("Spock", Set.of("tesoura", "pedra"));

        for (int i = 1; i <= x; i++) {

            String s = input.nextLine();
            String[] palavras =  s.split(" ");

            String palavraSheldon = palavras[0];
            String palavraRaj = palavras[1];

            if (palavraSheldon.equals(palavraRaj)) {
                System.out.println("Caso #" + i + ": De novo!");
            } else if (regras.get(palavraSheldon).contains(palavraRaj)) {
                System.out.println("Caso #" + i + ": Bazinga!");
            } else {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }

        }

    }

}

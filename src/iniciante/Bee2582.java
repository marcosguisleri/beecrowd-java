package iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee2582 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        Map<Integer, String> musicas = new HashMap<>();
        musicas.put(0, "PROXYCITY");
        musicas.put(1, "P.Y.N.G.");
        musicas.put(2, "DNSUEY!");
        musicas.put(3, "SERVERS");
        musicas.put(4, "HOST!");
        musicas.put(5, "CRIPTONIZE");
        musicas.put(6, "OFFLINE DAY");
        musicas.put(7, "SALT");
        musicas.put(8, "ANSWER!");
        musicas.put(9, "RAR?");
        musicas.put(10, "WIFI ANTENNAS");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println(musicas.get(a + b));
        }

    }

}
package iniciante;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Bee1146 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        String linha;
        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha.trim());

            if (n == 0) {
                break;
            }

            for (int i = 1; i <= n; i++) {
                output.append(i);
                if (i < n) {
                    output.append(" ");
                }
            }
            output.append("\n");
        }

        System.out.print(output.toString());

    }
}


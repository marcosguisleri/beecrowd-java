package iniciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bee1962 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder input = new StringBuilder(n * 12);

        for (int i = 0; i < n; i++) {
            long t = Long.parseLong(br.readLine());
            long a = 2015 - t;

            if (a >= 1) input.append(a).append(" D.C.\n");
            else input.append(1 - a).append(" A.C.\n");
        }

        System.out.print(input);

    }

}
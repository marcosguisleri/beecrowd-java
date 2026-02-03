package iniciante;

import java.io.IOException;

public class Bee1155 {

    public static void main(String[] args) throws IOException {

        double s = 0;

        for (int i = 1; i <= 100; i++) {
            s = s + (1.0 / i);
        }

        System.out.printf("%.2f\n", s);

    }
}


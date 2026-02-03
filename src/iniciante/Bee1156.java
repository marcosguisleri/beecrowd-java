package iniciante;

import java.io.IOException;

public class Bee1156 {

    public static void main(String[] args) throws IOException {

        double s = 0;

        for (int i = 1; i <= 20; i++) {
            double termo = (2.0 * i - 1) / Math.pow(2, i -1);
            s += termo;
        }

        System.out.printf("%.2f\n", s);

    }
}


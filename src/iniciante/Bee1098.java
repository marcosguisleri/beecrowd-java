package iniciante;
import java.io.IOException;

public class Bee1098 {

    public static void main(String[] args) throws IOException {

        double i = 0.0;

        while (i <= 2.0 + 1e-9) {
            for (int j = 1; j <= 3; j++) {
                double valJ = j + i;

                if (Math.abs(i - Math.round(i)) < 1e-9) {
                    System.out.print("I=" + (int)Math.round(i));
                } else {
                    System.out.printf("I=%.1f", i);
                }

                if (Math.abs(valJ - Math.round(valJ)) < 1e-9) {
                    System.out.println(" J=" + (int)Math.round(valJ));
                } else {
                    System.out.printf(" J=%.1f\n", valJ);
                }
            }
            i += 0.2;
        }

    }
}
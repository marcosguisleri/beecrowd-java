package iniciante;
import java.io.IOException;

public class Bee1095 {

    public static void main(String[] args) throws IOException {

        int i = 1;
        int j = 60;

        for (int cont = 0; cont <= 12; cont++) {
            System.out.println("I=" + i + " " + "J=" + j);
            i += 3;
            j -= 5;
        }

    }
}




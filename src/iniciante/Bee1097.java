package iniciante;
import java.io.IOException;

public class Bee1097 {

    public static void main(String[] args) throws IOException {

        int i = 1;
        int j = 7;

        for (int cont = 0; cont <= 4; cont++) {
            for (int x = 0; x < 3; x++) {
                System.out.println("I=" + i + " " + "J=" + j);
                j -= 1;
            }
            i += 2;
            j += 5;
        }

    }
}




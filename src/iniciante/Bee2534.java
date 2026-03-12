package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee2534 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            int n = input.nextInt();
            int q = input.nextInt();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(input.nextInt());
            }

            Collections.sort(list, Collections.reverseOrder());

            for (int i = 0; i < q; i++) {
                int consulta = input.nextInt();
                System.out.println(list.get(consulta - 1));
            }
        }

    }

}
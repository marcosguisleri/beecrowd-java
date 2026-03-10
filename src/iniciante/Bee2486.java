package iniciante;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee2486 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        map.put("suco de laranja", 120);
        map.put("morango fresco", 85);
        map.put("mamao", 85);
        map.put("goiaba vermelha", 70);
        map.put("manga", 56);
        map.put("laranja", 50);
        map.put("brocolis", 34);

        int x = input.nextInt();

        while (x != 0) {

            int total = 0;
            for (int i = 0; i < x; i++) {

                int q = input.nextInt();
                String alimento = input.nextLine().trim();

                total += q * map.get(alimento);

            }

            if (total >= 110 && total <= 130) {
                System.out.println(total + " mg");
            } else if (total > 130) {
                System.out.println("Menos " + (total - 130) + " mg");
            } else {
                System.out.println("Mais " + (110 - total) + " mg");
            }

            x = input.nextInt();
        }

    }

}
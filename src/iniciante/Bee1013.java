package iniciante;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Bee1013 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        int maiorAB = (a + b + abs(a - b)) / 2;

        if(maiorAB > c){
            System.out.println(maiorAB + " eh o maior");
        } else {
            System.out.println(c + " eh o maior");
        }

    }

}

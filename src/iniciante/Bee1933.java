package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1933 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a =  input.nextInt();
        int b = input.nextInt();

        int maior = Math.max(a, b);

        System.out.println(maior);

    }

}
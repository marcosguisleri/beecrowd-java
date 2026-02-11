package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1847 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int d1 = b - a;
        int d2 = c - b;

        if (d1 == 0) {
            if (d2 > 0) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        } else if (d1 > 0) {
            if (d2 <= 0) {
                System.out.println(":(");
            } else if (d2 > 0) {
                if (d2 >= d1) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        } else if (d1 < 0) {
            if (d2 >= 0) {
                System.out.println(":)");
            } else if (d2 < 0) {
                if (d2 > d1) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            }
        }

    }

}

package iniciante;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Bee1929 {

    static boolean tri(int x, int y, int z) {
        int[] t = {x, y, z};
        Arrays.sort(t);
        return t[0] + t[1] > t[2];
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        boolean ok = tri(a,b,c) || tri(a,b,d) || tri(a,c,d) || tri(b,c,d);

        System.out.println(ok ? "S" : "N");

    }

}

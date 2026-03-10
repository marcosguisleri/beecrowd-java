package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2176 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String x = input.nextLine();

        long qtd = x.chars().filter(c -> c == '1').count();
        char bit = (qtd % 2 == 0) ? '0' : '1';
        String saida = x + bit;

        System.out.println(saida);

    }

}
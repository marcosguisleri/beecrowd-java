package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1038 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int codigoProduto =  input.nextInt();
        int quantidade = input.nextInt();

        switch (codigoProduto) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", (quantidade * 4.0));
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", (quantidade * 4.5));
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", (quantidade * 5.0));
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", (quantidade * 2.0));
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", (quantidade * 1.5));
                break;
        }

    }

}

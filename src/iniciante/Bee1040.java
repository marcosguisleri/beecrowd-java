package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1040 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double n1, n2, n3, n4;

        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + n4) / 10.0;

        media = Math.floor(media * 10) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaExame = input.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (media + notaExame) / 2.0;
            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", media);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }

}

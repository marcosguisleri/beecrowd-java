package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1983 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int qtdAlunos = input.nextInt();

        double maiorNota = -1.0;
        long matriculaAchada = -1;

        for (int i = 0; i < qtdAlunos; i++) {
            long matricula = input.nextLong();
            double nota = input.nextDouble();

            if (nota > maiorNota) {
                maiorNota = nota;
                matriculaAchada = matricula;
            }
        }

        if (maiorNota >= 8.0) {
            System.out.println(matriculaAchada);
        } else {
            System.out.println("Minimum note not reached");
        }

    }

}

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1047 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int horaInicial = input.nextInt();
        int minutoInicial = input.nextInt();
        int horaFinal = input.nextInt();
        int minutoFinal = input.nextInt();

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;

        int duracao;

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (1440 - inicio) + fim;
        }

        int horas = duracao / 60;
        int minutos = duracao % 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

    }

}

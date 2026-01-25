package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1046 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        int horaInicio = input.nextInt();
        int horaFim = input.nextInt();

        if (horaInicio > horaFim) {
            System.out.println("O JOGO DUROU " + (24 - horaInicio + horaFim) + " HORA(S)");
        } else if (horaInicio == horaFim) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (horaFim - horaInicio) + " HORA(S)");
        }

    }

}

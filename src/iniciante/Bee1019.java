package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1019 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int segundosEntrada =  input.nextInt();

        int horas = segundosEntrada / 3600;
        int sobraHoras = segundosEntrada % 3600;

        int minutos = sobraHoras / 60;
        int sobraMinutos = sobraHoras % 60;

        int segundos = sobraMinutos;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }

}

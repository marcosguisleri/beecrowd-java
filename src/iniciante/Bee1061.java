package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1061 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String diaInicial = input.nextLine();
        String momentoInicial = input.nextLine();
        String diaFinal = input.nextLine();
        String momentoFinal = input.nextLine();

        int diaInicialDigito = Integer.parseInt(diaInicial.replaceAll("\\D", ""));
        int diaFinalDigito = Integer.parseInt(diaFinal.replaceAll("\\D", ""));

        String[] partesInicial = momentoInicial.split(":");
        int horasInicial = Integer.parseInt(partesInicial[0].trim());
        int minutosInicial = Integer.parseInt(partesInicial[1].trim());
        int segundosInicial = Integer.parseInt(partesInicial[2].trim());

        String[] partesFinal = momentoFinal.split(":");
        int horasFinal = Integer.parseInt(partesFinal[0].trim());
        int minutosFinal = Integer.parseInt(partesFinal[1].trim());
        int segundosFinal = Integer.parseInt(partesFinal[2].trim());

        int totalSegundosInicial = (diaInicialDigito * 86400) + (horasInicial * 3600) + (minutosInicial * 60) + segundosInicial;
        int totalSegundosFinal = (diaFinalDigito * 86400) + (horasFinal * 3600) + (minutosFinal * 60) + segundosFinal;

        int diferenca = totalSegundosFinal - totalSegundosInicial;

        int dias = diferenca / 86400;
        int horas = (diferenca % 86400) / 3600;
        int minutos = (diferenca % 3600) / 60;
        int segundos = diferenca % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}

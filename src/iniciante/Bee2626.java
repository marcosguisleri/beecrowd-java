package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee2626 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {

            String jogada = input.nextLine();
            String[] jogadas = jogada.split(" ");

            String dodo = jogadas[0];
            String leo = jogadas[1];
            String pepper = jogadas[2];

            if ((dodo.equals("papel") && leo.equals("pedra") && pepper.equals("pedra")) ||
                    (dodo.equals("tesoura") && leo.equals("papel") && pepper.equals("papel")) ||
                    (dodo.equals("pedra") && leo.equals("tesoura") && pepper.equals("tesoura"))) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if ((leo.equals("papel") && dodo.equals("pedra") && pepper.equals("pedra")) ||
                    (leo.equals("tesoura") && dodo.equals("papel") && pepper.equals("papel")) ||
                    (leo.equals("pedra") && dodo.equals("tesoura") && pepper.equals("tesoura"))) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if ((pepper.equals("papel") && dodo.equals("pedra") && leo.equals("pedra")) ||
                    (pepper.equals("tesoura") && dodo.equals("papel") && leo.equals("papel")) ||
                    (pepper.equals("pedra") && dodo.equals("tesoura") && leo.equals("tesoura"))) {
                System.out.println("Urano perdeu algo muito precioso...");
            } else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }

        }

    }

}
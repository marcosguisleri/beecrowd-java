package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1020 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int idadePessoaEmDias = input.nextInt();

        int anos = idadePessoaEmDias / 365;
        int sobraAnos = idadePessoaEmDias % 365;

        int meses = sobraAnos / 30;
        int sobraMeses = sobraAnos % 30;

        int dias = sobraMeses;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

    }

}

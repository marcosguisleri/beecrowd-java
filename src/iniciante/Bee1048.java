package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Bee1048 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner (System.in);

        double salarioFuncionario = input.nextDouble();

        if (salarioFuncionario >= 0 && salarioFuncionario <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", (salarioFuncionario * 0.15 + salarioFuncionario));
            System.out.printf("Reajuste ganho: %.2f\n", ((salarioFuncionario * 0.15 + salarioFuncionario) - salarioFuncionario));
            System.out.println("Em percentual: 15 %");
        } else if (salarioFuncionario >= 400.01 && salarioFuncionario <= 800.00) {
            System.out.printf("Novo salario: %.2f\n", (salarioFuncionario * 0.12 + salarioFuncionario));
            System.out.printf("Reajuste ganho: %.2f\n", ((salarioFuncionario * 0.12 + salarioFuncionario) - salarioFuncionario));
            System.out.println("Em percentual: 12 %");
        } else if (salarioFuncionario >= 800.01 && salarioFuncionario <= 1200.00) {
            System.out.printf("Novo salario: %.2f\n", (salarioFuncionario * 0.10 + salarioFuncionario));
            System.out.printf("Reajuste ganho: %.2f\n", ((salarioFuncionario * 0.10 + salarioFuncionario) - salarioFuncionario));
            System.out.println("Em percentual: 10 %");
        } else if (salarioFuncionario >= 1200.01 && salarioFuncionario <= 2000.00) {
            System.out.printf("Novo salario: %.2f\n", (salarioFuncionario * 0.07 + salarioFuncionario));
            System.out.printf("Reajuste ganho: %.2f\n", ((salarioFuncionario * 0.07 + salarioFuncionario) - salarioFuncionario));
            System.out.println("Em percentual: 7 %");
        } else {
            System.out.printf("Novo salario: %.2f\n", (salarioFuncionario * 0.04 + salarioFuncionario));
            System.out.printf("Reajuste ganho: %.2f\n", ((salarioFuncionario * 0.04 + salarioFuncionario) - salarioFuncionario));
            System.out.println("Em percentual: 4 %");
        }


    }

}

import java.text.DecimalFormat;
import java.util.Scanner;

public class eSalarioMinimo {
    public static void main(String[] args) {
        //5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário
        // de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima
        // na tela o resultado. (Base para o Salário mínimo R$ 1.412).
        Scanner scanner = new Scanner(System.in);
        System.out.println("O salário mínimo é 1,412$");
        System.out.println("Digite o seu salário:");
        double userSalary = scanner.nextDouble();
        double salarioMinimo = 1.412;
        double salario = userSalary /salarioMinimo;
        System.out.println("Com base no salário mínimo você recebe " +new DecimalFormat(".##").format(salario) + " mínimos");

    }
}

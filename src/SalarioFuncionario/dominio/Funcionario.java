package SalarioFuncionario.dominio;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salarioFolha;
    private double imposto;
    private double salarioDesconto;
    Scanner ler = new Scanner(System.in);


    public void dadosUser() {
        System.out.println("Digite seu nome:");
        System.out.println("Digite seu salário:");
        System.out.println("Digite o valor do imposto;");

        nome = ler.next();
        salarioFolha = ler.nextDouble();
        imposto = ler.nextDouble();
        salarioDesconto = salarioFolha - imposto;
        System.out.println(toString());
        aumentoSalario();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBruto=" + salarioDesconto +
                '}';
    }

    public void aumentoSalario() {
        System.out.println("Quantos porcento você quer acresentar de aumento?");
        double aumento = ler.nextDouble();
        double porcentagem = (aumento / 100) * salarioFolha;
        double realSalary = porcentagem + salarioDesconto;

        System.out.println("Atualização: nome " + nome + " salário " + realSalary);

    }

}

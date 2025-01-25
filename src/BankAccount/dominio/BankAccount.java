package BankAccount.dominio;

import java.util.Scanner;

public class BankAccount {
private String nome;
private int numeroConta;
private  double saldo;
    Scanner scan = new Scanner(System.in);

    public BankAccount() {

    }



    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }



    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void deposito(){
        System.out.println("Digite o valor do deposito :");
       double valor = scan.nextDouble();
        saldo += valor;
    }
    public void saque( ){
        System.out.println("Digite o valor de saque:");
        double valor = scan.nextDouble();
        double tax = valor * 0.05;
        saldo -= valor + tax;
        if (valor > saldo){
            throw new RuntimeException("Valor indisponível para saque.");
        }
    }
}

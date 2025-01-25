package BankAccount.test;

import BankAccount.dominio.BankAccount;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BankAccount bank = new BankAccount();

        System.out.println("Digite o nome do titular:");
        bank.setNome(scan.next());
        System.out.println("Digite o número da conta:");
        bank.setNumeroConta(scan.nextInt());
        System.out.println("Você pretende fazer um deposito inicial?(y/n)");
        char respsota = scan.next().charAt(0);
        if (respsota == 'y'){
            bank.deposito();
            System.out.println(bank);
            bank.deposito();
            System.out.println(bank);
            bank.saque();
            System.out.println(bank);

        }

    }

}

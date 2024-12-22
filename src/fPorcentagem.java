import java.util.Scanner;

public class fPorcentagem {
    public static void main(String[] args) {
        //6 - Faça um algoritmo que leia um valor qualquer
        // e imprima na tela com um reajuste de 5%.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        int porcentagem = num *5/100;
        int reajuste = num - porcentagem ;
        System.out.println("Esse é o número com o reajuste " + reajuste);
    }
}

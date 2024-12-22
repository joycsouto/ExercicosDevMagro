import java.util.Scanner;

public class gVouF {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores booleanos (lógicos)
        // e determine se ambos são VERDADEIRO ou FALSO.

        Scanner scan = new Scanner(System.in);
        System.out.println(" 3 é maior que 2?");
        System.out.println(" 2 é menor que 3?");
        boolean valor1 = scan.hasNext();
        boolean valor2 = scan.hasNext();
        if (valor1 && valor2){
            System.out.println(valor1);
            System.out.println(valor2);
        }

    }
}

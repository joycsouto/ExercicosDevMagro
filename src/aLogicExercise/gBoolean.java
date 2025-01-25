package aLogicExercise;

import java.util.Scanner;

public class gBoolean {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores booleanos (lógicos)
        // e determine se ambos são VERDADEIRO ou FALSO.
        boolean valor1, valor2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it true or false that you are of legal age?");
        valor1 = scan.nextBoolean();
        System.out.println("Is it true or false that you live with you parents?");
        valor2 = scan.nextBoolean();
        if (valor1 && valor2) {
            System.out.println("Both are true");
        } else if (!valor1 && !valor2) {
            System.out.println("Both are false");
        } else System.out.println("The values are different");

    }
}

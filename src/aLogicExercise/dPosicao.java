package aLogicExercise;

import java.util.Scanner;

public class dPosicao {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número inteiro
        // e imprima na tela o seu antecessor e o seu sucessor.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        int antecessor = num -1;
        int sucessor = num + 1;
        System.out.println(" O antecessor é " + antecessor  + " o número escolhido é " + num + " e os sucessor é " + sucessor);
    }
}

import java.util.Scanner;

public class cValidacaoValores {
    public static void main(String[] args) {
        // Faça um algoritmo que leia dois valores inteiros A e B, se os valores de
        //A e B forem iguais, deverá somar os dois valores,
        //caso contrário devera multiplicar A por B. Ao final de
        // qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
        //imprimir seu valor na tela.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite dois valores:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = a +b;
        int mult = a * b;
        int c;
        if (a ==b ){
            c = soma;
            System.out.println("Os núemros são iguais a soma deles é " + c);
        }else {
            c =mult;
            System.out.println("Os números são diferentes a multiplicação deles é "+ c);
        }
    }}

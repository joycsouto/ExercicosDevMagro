import java.util.Scanner;

public class aPrinter {
    public static void main(String[] args) {
        //Faça um algoritmo que leia os valores de A, B, C e em seguida imprima
        // na tela a soma entre A e B é mostre se a soma é menor que C.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 3 valores:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int soma = a +b ;
        System.out.println("A soma entre o primeiro e segundo número é : " +soma);
        if(soma < c){
            System.out.println("A soma é menor que o terceiro número");
        }else System.out.println("A soma é maior que o terceiro número");
    }
}
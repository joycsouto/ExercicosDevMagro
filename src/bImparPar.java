import java.util.Scanner;

public class bImparPar {
    public static void main(String[] args) {
        //Faça um algoritmo para receber um número qualquer
        // e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número :");
        int num = scan.nextInt();
        if(num %2 == 0 ){
            System.out.print("Esse número é par");}
        else System.out.print("Esse número é impar");
        if(num < 0){
            System.out.print(" e negativo");
        }else System.out.print(" e positivo");
    }
}

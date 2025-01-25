package MethodsExercise.CotacaoDolar.dominio;

import java.util.Scanner;

public class CurrencyConverter {


    public double valueBought;
    public double dolarPrice;


    public void coletandoDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the dolar price?");
         dolarPrice = scan.nextDouble();
        System.out.println("How many dollars wil be bought?");
        valueBought = scan.nextDouble();
        System.out.println("Amount to be paid in reais");
        System.out.println(calculo());
    }
    public  double calculo(){
        double valueReais = dolarPrice * valueBought ;
        double tax = valueReais * 0.06;
        return valueReais + tax;
    }

}

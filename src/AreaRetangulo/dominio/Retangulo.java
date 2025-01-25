package AreaRetangulo.dominio;

import java.util.Scanner;

public class Retangulo {
    private double altura;
    private double largura;



    public void dadosRetangulo(){
        Scanner ler =new Scanner(System.in);
        System.out.println("Digite a altura e a largura:");
        altura = ler.nextDouble();
        largura = ler.nextDouble();
        System.out.println("ÁREA = " + area());
        System.out.println("PERÍMETRO = " + perimetro());
        System.out.println("DIAGONAL = " + diagonal());

    }

    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        double mult = altura *2 + largura *2;
        return mult;
    }
    public double diagonal(){
        double v = altura * altura + largura * largura;
      return v = Math.sqrt(v);

    }
}

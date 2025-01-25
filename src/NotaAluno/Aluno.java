package NotaAluno;

import java.util.Scanner;

public class Aluno {
    private String nome;
    Double nota1,nota2,nota3;
    Scanner scan = new Scanner(System.in);
    public void dadosAlunos(){
        System.out.println("Digite o seu nome:");
        nome = scan.next();
        System.out.println("Digite suas notas dos 3 trimestres");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        
    }
}

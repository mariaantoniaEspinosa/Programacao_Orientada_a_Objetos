kage pkg;

import java.util.Scanner;

public class AlunoExecutavel {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

        Aluno a = new Aluno();
        
        double media;
        
        System.out.print("Digite o nome do aluno: ");
        a.nome = teclado.nextLine();

        System.out.print("Digite a matrícula: ");
        a.matricula = teclado.nextLine();

        System.out.print("Digite a nota 1: ");
        a.nota1 = teclado.nextDouble();

        System.out.print("Digite a nota 2: ");
        a.nota2 = teclado.nextDouble();

        System.out.print("Digite a nota 3: ");
        a.nota3 = teclado.nextDouble();
        
        media = (a.nota1 + a.nota2 + a.nota3) / 3;
        
        System.out.println("Aluno  " + a.nome);
        System.out.println("Matrícula: " + a.matricula);
        System.out.println("Média: " + media);

        if(media >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
	}

}

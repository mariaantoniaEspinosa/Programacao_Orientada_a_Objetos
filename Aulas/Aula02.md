# Laços de Repetição
```
package pkg;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Inteiro: ");
		int n = teclado.nextInt();
		System.out.println("Int digitado: " + n);
		System.out.println("Double: ");
		double n1 = teclado.nextDouble();
		System.out.println("Double digitado: " + n1);
		teclado.nextLine();
		System.out.println("Palavra: ");
		String palavra = teclado.nextLine();
		System.out.println("Palavra digitada: " + palavra);
		System.out.println("Palavra: ");
		palavra = teclado.next();
		System.out.println("Palavra digitada com .next: " + palavra);
		
		teclado.close();
		
		for(int i = 0; i<10; i++) {
			//o i existirá somente aqui dentro
			System.out.println("I vale: " + i);
		}
		
		int i = 0;
		while(i < 10) {
		    System.out.println("I vale: " + i);
		    i++;
		}
		int j =0 ;
		do {
			System.out.println("I vale com do while: " + j);
			j++;
		}while(j<10);
		

	}

}

```
# Vetores
```
package pkg;

import java.util.Scanner;

public class VetoresMatrizes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int []vetor = new int[5];
		
		vetor [0] = 5;
		vetor [1] = 10;
		vetor [2] = 15;
		vetor [3] = 20;
		vetor [4] = 25;
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite o elemento " + i + ":");
			vetor[i] = teclado.nextInt();
		}
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Elemento " + i + " = " + vetor[i]);
		}

	}

}
```
# Matrizes 
```
package pkg;

import java.util.Scanner;

public class VetoresMatrizes {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int[][] matriz = new int [2][2];
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println("Digite o elemento["+i+"]["+j+"]");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz.length; j++) {
				System.out.println("Elemento["+i+"]["+j+"]= " + matriz[i][j]);
			}
		}
		
		System.out.println("Matriz: \n");
		for(int i = 0; i< matriz.length; i++) {
			for(int j = 0; j< matriz.length; j++) {
				System.out.print(+ matriz[i][j] + " \t");
			}
			System.out.println("\n");
		}

	}

}
```






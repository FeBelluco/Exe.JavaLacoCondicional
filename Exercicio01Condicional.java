package br.com.generation.exercicio01;

import java.util.Scanner;

public class Exercicio01Condicional {

	public static void main(String[] args) {
		// Fa�a um progama que receba 3 n�meros inteiros e diga qual deles � o maior.
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite o primeiro n�mero: ");
		a= entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b= entrada.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c= entrada.nextInt();
		
		if(a>b && a>c) {
			maior = a;
		}	
		else if(b>a && b>c) {
			maior = b;
		}	
		else {	
			maior = c;
		}
		System.out.println("O maior n�mero �: " + maior);	
		
		entrada.close();
	}

}

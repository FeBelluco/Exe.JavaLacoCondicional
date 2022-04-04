package br.com.generation.exercicio01;

import java.util.Scanner;

public class Exercicio01Condicional {

	public static void main(String[] args) {
		// Faça um progama que receba 3 números inteiros e diga qual deles é o maior.
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite o primeiro número: ");
		a= entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		b= entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
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
		System.out.println("O maior número é: " + maior);	
		
		entrada.close();
	}

}

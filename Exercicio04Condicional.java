package br.com.generation.exercicio02;

import java.util.Scanner;

public class Exercicio04 {
	
	/*
	 * Faça um programa em que permita a entrada de um número qualquer 
	 * e exiba se este número é par ou ímpar. 
	 * Se for par exiba também a raiz quadrada do mesmo; 
	 * se for ímpar exiba o número elevado ao quadrado
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num, raiz2, raiz3, elevado;
		
		System.out.println("Digite o número: ");
		num = entrada.nextDouble();
		
		if(num % 2 == 0){
			System.out.println("Par...");
			raiz2 = Math.sqrt(num); //"sqrt" usado para a raiz.
			raiz3 = Math.cbrt(num); //"cbrt" usado para raiz cubica
			
			System.out.println("Raíz quadrada é: " + raiz2);
			System.out.println("Raiz cubica é: " + raiz3);
		}
		else if(num % 2 == 1) {
			System.out.println("Ímpar...");
		
			elevado = Math.pow(num, 2);
			System.out.println("A potência é: " + elevado);
		}
			
	}
}


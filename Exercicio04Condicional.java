package br.com.generation.exercicio02;

import java.util.Scanner;

public class Exercicio04 {
	
	/*
	 * Fa�a um programa em que permita a entrada de um n�mero qualquer 
	 * e exiba se este n�mero � par ou �mpar. 
	 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
	 * se for �mpar exiba o n�mero elevado ao quadrado
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num, raiz2, raiz3, elevado;
		
		System.out.println("Digite o n�mero: ");
		num = entrada.nextDouble();
		
		if(num % 2 == 0){
			System.out.println("Par...");
			raiz2 = Math.sqrt(num); //"sqrt" usado para a raiz.
			raiz3 = Math.cbrt(num); //"cbrt" usado para raiz cubica
			
			System.out.println("Ra�z quadrada �: " + raiz2);
			System.out.println("Raiz cubica �: " + raiz3);
		}
		else if(num % 2 == 1) {
			System.out.println("�mpar...");
		
			elevado = Math.pow(num, 2);
			System.out.println("A pot�ncia �: " + elevado);
		}
			
	}
}


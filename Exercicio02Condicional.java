package br.com.generation.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
	//2.Faça um programa que entre com 3 números e coloque-os em ordem crescente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Entre com três números: ");
		n1= entrada.nextInt();
		n2= entrada.nextInt();
		n3= entrada.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente: \n " + n1 + "|" + n2 + "|" + n3);	
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente é: \n" + n1 + "|" + n3+ "|" + n2);
		}
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente é: \n" + n2 + "|" + n1 + "|" + n3);
		}	
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente é: \n" + n2 + "|" + n3+ "|" + n1);
		}
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente é: \n" + n3 + "|" + n1 + "|" + n2);
		}
		else if(n3 <= n2 && n2 <= n1) {
			System.out.println("A ordem crescente é: \n" + n3 + "|" + n2 + "|" + n1);
		}
		
		entrada.close();
	}
}
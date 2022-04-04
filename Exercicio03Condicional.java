package br.com.generation.exercicio02;

import java.util.Scanner;

public class Exercicio03 {
		
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria
		 * ela se encontra:
		 * 10-14 infantil
		 * 15-17 juvenil
		 * 18-25 adulto
		 */
	
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		int idade;
		
		System.out.println("Escreva a idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14 ) { 
		System.out.println("Infantil!");	
		}
		
		else if(idade >= 15 && idade <= 17) {
		System.out.println("Juvenil!");	
		}
		
		else if(idade >= 18 && idade <= 25) {
		System.out.println("Adulto!");	
		}
		
		else {
			System.out.println("Idade inválida!");
			System.out.println("-----Fim-----");
		}
		entrada.close();
	}
}

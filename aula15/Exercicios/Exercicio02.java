package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = scan.nextInt();
		
		if(num % 2 == 0){
			System.out.println("O número é positivo");
		} else{
			System.out.println("O número é negativo");
		}
	}

}

package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num01 = scan.nextInt();
		System.out.println("Digite outro número inteiro:");
		int num02 = scan.nextInt();
		
		if (num01 > num02){
			System.out.println("O maior número é: " + num01);
		} else {
			System.out.println("O maior número é: " + num02);
		}
	}

}

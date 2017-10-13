package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		double resultado = (72.7 * altura) - 58;
		System.out.println("Seu Peso ideal é: " + resultado);
		
	}

}

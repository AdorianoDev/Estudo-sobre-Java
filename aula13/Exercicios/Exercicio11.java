package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro valor inteiro: ");
		int num2 = scan.nextInt();
		System.out.println("Digite um valor com vírgula: ");
		double num3 = scan.nextDouble();
		double resultadoA = (num1 * 2) + (num2 / 2);
		double resultadoB = (num1 * 3) + num3;
		double resultadoC = num3 * num3 * num3;
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultadoA);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultadoB);
		System.out.println("O terceiro elevado ao cubo é: " + resultadoC);
		
	}

}

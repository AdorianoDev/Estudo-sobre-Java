package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		double resultado = num1 + num2;
		System.out.println("A soma dos dois n�meros �: " + resultado);

	}

}

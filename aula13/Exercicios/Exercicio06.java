package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor do raio do c�rculo: ");
		double raio = scan.nextDouble();
		double area = 3.14 * Math.pow(raio,2);//a fun��o Math.pow serve para calcular n�meros elevados.
		System.out.print("A �rea do c�rculo �: " + area);
				

	}

}

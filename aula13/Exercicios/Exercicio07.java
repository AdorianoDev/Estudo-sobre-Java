package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do quadrado em cm: ");
		double base = scan.nextDouble();
		//System.out.println("Digite a altura do quadrado em cm: ");
		//double altura = scan.nextDouble();
		double area = base * base;
		double dobro = area * 2;
		System.out.println("O dobro da área do quadrado é: " + dobro + "cm²");
				
	}

}

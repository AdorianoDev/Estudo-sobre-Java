package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite os metros: ");
		double metros = scan.nextDouble();
		double resultado = metros * 100;
		System.out.print(metros + " metros é equivalente a " + resultado + " centímetros.");
		
	}

}

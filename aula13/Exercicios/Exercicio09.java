package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Farenheit: ");
		double faren = scan.nextDouble();
		double celcius = (5 * (faren-32) / 9);
		System.out.println("A temperatura em graus Celcius é: " + celcius + "°C");
	}

}

package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus Celcius: ");
		double celcius = scan.nextDouble();
		double faren = ((celcius / 5) * 9 + 32);
		System.out.println("A temperatura em Farenheit é: " + faren + "F°");
	}

}

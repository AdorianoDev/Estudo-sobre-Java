package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o quanto ganha por hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantas horas trabalha por mês: ");
		double horaMes = scan.nextDouble();
		double resultado = valorHora * horaMes;
		System.out.println("O seu salário é: R$ " + resultado);
	}

}

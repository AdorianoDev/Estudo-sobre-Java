package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a primeira nota do bimestre: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota do bimestre: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota do bimestre: ");
		double nota3 = scan.nextDouble();
		System.out.print("Digite a quarta nota do bimestre: ");
		double nota4 = scan.nextDouble();
		double resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.print("A média das notas é: " + resultado);

	}

}

package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quanto recebe por hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Digite quantas horas trabalha por mês: ");
		double horaMes = scan.nextDouble();
		double salario = valorHora * horaMes;
		double impostoRenda = ((salario * 11) / 100);
		double inss = ((salario * 8) / 100);
		double sindicato = ((salario * 5) / 100);
		double liquido = salario - impostoRenda - inss - sindicato;
		System.out.println("O senhor(a) pagou ao INSS: R$ " + inss);
		System.out.println("O senhor(a) pagou ao Sindicato: R$ " + sindicato);
		System.out.println("O seu salário líquido é: R$ " + liquido);
		
		
	}

}
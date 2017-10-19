package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota:");
		double nota01 = scan.nextDouble();
		System.out.println("Entre com a segunda nota:");
		double nota02 = scan.nextInt();
		
		double media = (nota01 + nota02) / 2;
		
		if(media >= 7 && media < 10){
			System.out.println("Aprovado");
		}else if(media < 7){
			System.out.println("Reprovado");
		}else if(media == 10){
			System.out.println("Aprovado com Distinção");
		}else{
			System.out.println("Valor digitado inválido");
		}
	}

}

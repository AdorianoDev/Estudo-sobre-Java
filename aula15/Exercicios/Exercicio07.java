package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro n�mero:");
		double num01 = scan.nextDouble();
		System.out.println("Entre com o segundo n�mero");
		double num02 = scan.nextDouble();
		System.out.println("Entre com o terceiro n�mero");
		double num03 = scan.nextDouble();
		
		if(num01 > num02 && num01 > num03){
			System.out.println("O maior n�mero �: " + num01);
		} else if(num02 > num01 && num02 > num03){
			System.out.println("O maior n�mero �: " + num02);
		} else{
			System.out.println("O maior n�mero �: " + num03);
		}
		if(num01 < num02 && num01 < num03){
			System.out.println("O menor n�mero �: " + num01);
		} else if(num02 < num01 && num02 < num03){
			System.out.println("O menor n�mero �: " + num02);
		} else{
			System.out.println("O menor n�mero �: " + num03);
		}
		
	}

}

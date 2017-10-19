package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		double num01 = scan.nextDouble();
		System.out.println("Entre com o segundo número");
		double num02 = scan.nextDouble();
		System.out.println("Entre com o terceiro número");
		double num03 = scan.nextDouble();
		
		if(num01 > num02 && num01 > num03){
			System.out.println("O maior número é: " + num01);
		} else if(num02 > num01 && num02 > num03){
			System.out.println("O maior número é: " + num02);
		} else{
			System.out.println("O maior número é: " + num03);
		}
		if(num01 < num02 && num01 < num03){
			System.out.println("O menor número é: " + num01);
		} else if(num02 < num01 && num02 < num03){
			System.out.println("O menor número é: " + num02);
		} else{
			System.out.println("O menor número é: " + num03);
		}
		
	}

}

package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o preço do primeiro produto:");
		double preco01 = scan.nextDouble();
		System.out.println("Entre com o preço do segundo produto:");
		double preco02 = scan.nextDouble();
		System.out.println("Entre com o preço do terceiro produto:");
		double preco03 = scan.nextDouble();
		
		if (preco01 < preco02 && preco01 < preco03){
			System.out.println("Compre o produto de valor: R$ " + preco01);
		} else if (preco02 < preco01 && preco02 < preco03){
			System.out.println("Compre o produto de valor: R$ " + preco02);
		} else{
			System.out.println("Compre o produto de valor: R$ " + preco03);
		}
	}

}

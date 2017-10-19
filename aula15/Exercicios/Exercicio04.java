package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra(A-Z):");
		String letra = scan.nextLine().toUpperCase();
		
		
		switch(letra){
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("A letra (" + letra + ") é uma vogal"); break;
		default: System.out.println("A letra (" + letra + ") é uma consoante"); break;
		}
	}

}

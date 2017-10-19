package com.loiane.cursojava.aula15Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Sexo(F/M):");
		String sexo = scan.nextLine();
		
		if (sexo.equals("F") || sexo.equals("f")){
			System.out.println("Feminino");
		} else if (sexo.equals("M") || sexo.equals("m")){
			System.out.println("Masculino");
		} else{
			System.out.println("Sexo inválido");
		}
	}

}

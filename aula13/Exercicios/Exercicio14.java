package com.loiane.cursojava.aula13Exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo(em MB) para download: ");
		double arquivo = scan.nextDouble();
		System.out.print("Digite a velocidade de download(em Mbps) do link de internet: ");
		double velocidade = scan.nextDouble();
		double tempo = (arquivo / velocidade) / 60;
		System.out.println("O tempo aproximado para o download é de: " + tempo + " minutos.");
	}

}

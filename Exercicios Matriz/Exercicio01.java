package com.array.aula20.exercicios;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		int[][] M = new int[4][4];

		Random random = new Random();

		int maior = M[0][0];
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {

				M[i][j] = random.nextInt(10);

				linha = i; 
				coluna = j;

				System.out.println(M[i][j]);

				if (maior < M[i][j]) {
					maior = M[i][j];

				}
			}
		}

		System.out.println("O maior valor da matriz é: " + maior + "\nE sua posição é " + "\nLinha= " + linha
				+ "\nColuna = " + coluna);
	}

}

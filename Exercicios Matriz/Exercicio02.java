package com.array.aula20.exercicios;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		int[][] M = new int[10][10];
		
		Random random = new Random();
		
		int maior = 0;
		int menor = 0;
		
		for (int i = 0; i < M.length; i++) {
			
			for (int j =0; j < M[i].length; j++) {
				
				M[i][j] = random.nextInt(50);
				
				if (maior < M[i][j]) {
					maior = M[i][j];
				}
				
				for (int l = maior; l < M[i].length; l--) {
					
					if (menor > M[i][j]) {
						menor = M[i][j];
					}
					
				}
				
				System.out.println(M[i][j]);
			}
			
		}
		
		System.out.println("O maior valor é " + maior + "\nE o menor valor é = " + menor); 
		
	}

}
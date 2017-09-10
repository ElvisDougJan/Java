package com.array.aula19.exercicios;

//import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		int[] A = new int[8];
		int[] B = new int[8];

		// Random random = new Random();

		for (int i = 0; i < A.length; i++) {
			int aux = 0;
			// A[i] = random.nextInt(9);
			A[i] = i + 1;
			System.out.println("Vetor A " + A[i]);

			for (int j = 0; j < B.length; j++) {
				B[j] = A[i] * 2;
				aux = B[j];
			}
			System.out.println("O vetor B vezes 2 é " + aux);
		}
	}

}

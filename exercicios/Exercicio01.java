package com.array.aula19.exercicios;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		int[] A = new int[5];
		int[] B = new int[5];

		Random random = new Random();

		for (int i = 0; i < A.length; i++) {

			A[i] = random.nextInt(10);

			System.out.println("Vetor A: " + A[i]);
			B = A;

		}

		for (int j = 0; j < B.length; j++) {
			System.out.println("Vetor B: " + B[j]);
		}

	}

}

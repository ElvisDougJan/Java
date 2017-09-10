package com.array.aula19.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			a[i] = i - 1 + 1;
			System.out.println("Vetor A: " + a[i]);

		}

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i] * i;
			System.out.println("Vetor B: " + b[i]);
		}
	}

}

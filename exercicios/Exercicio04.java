package com.array.aula19.exercicios;

public class Exercicio04 {

	public static void main(String[] args) {

		int[] a = new int[15];
		int[] b = new int[15];

		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println("O vetor A é " + a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			b[i] = (int) Math.sqrt(a[i]);
			System.out.println("Vetor B");
			System.out.println(b[i]);
		}

	}

}

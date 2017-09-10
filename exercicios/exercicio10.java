package com.array.aula19.exercicios;

import java.util.Random;

public class exercicio10 {

	public static void main(String[] args) {
		

		int[] a = new int[10];
		int[] b = new int[10];
		
		
		Random random = new Random();
		
		System.out.println("Vetor A");
		for(int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(20);
			System.out.println(a[i]);
		}
		
		System.out.println("Vetor B");
		for(int i = 0; i < b.length; i++) {
			//b[i] = random.nextInt(20);
			b[i] = a[i] % 2;
			System.out.println(b[i]);
		}
		
		
	}

}

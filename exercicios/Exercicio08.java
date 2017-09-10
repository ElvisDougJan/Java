package com.array.aula19.exercicios;

import java.util.Random;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		Random random = new Random();
		
		System.out.println("Vetor A");
		for (int i = 0; i < a.length; i++) {
			
			a[i] = random.nextInt(10);
			System.out.println(a[i]);
			
		}
		
		System.out.println("Vetor B");
		for (int i = 0; i < b.length; i++) {
			
			b[i] = random.nextInt(10);
			System.out.println(b[i]);
			
		}
		
		System.out.println("Vetor C");
		for (int i = 0; i < c.length; i++) {
			
			c[i] = a[i] * b[i];
			System.out.println(c[i]);
			
		}

	}

}

package com.array.aula19.exercicios;

import java.util.Random;

public class Exercicio11 {

	public static void main(String[] args) {

		int[] a = new int[10];

		Random random = new Random();
		int contador = 0;
		
		System.out.println("Os números pares são: ");
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = random.nextInt(100);
			int resto = a[i] % 2;
			
			if (resto == 0) {
				System.out.println(a[i]);
				contador++;
			}
			
		}
		
		System.out.println("\nE a quantidade de números pares são: " + contador);
	
	}

}

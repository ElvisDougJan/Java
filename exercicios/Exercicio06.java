package com.array.aula19.exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		 int[] a = new int[10];
		 int[] b = new int[10];
		 int[] c = new int[10];
		 
		 for (int i = 0; i < a.length; i++) {
			 a[i] = i + 1;
		 }
		 
		 for (int i = 0; i < b.length; i++) {
			 b[i] = i + 1;
		 }
		 
		 for (int i = 0; i < c.length; i++) {
			 c[i] = a[i] + b[i];
			 System.out.println(c[i]);
		 }
	}

}

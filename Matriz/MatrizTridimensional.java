package com.array.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

				
		int[][][] matrizTridimensional = new int[3][3][3];

		for (int i = 0; i < matrizTridimensional.length; i++) {

			for (int j = 0; j < matrizTridimensional[i].length; j++) {

				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					System.out.println("i: " + i + " j: " + j + " k: " + k );
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		
		int somaTotal = 0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i = 0; i < matrizTridimensional.length; i++) {

			for (int j = 0; j < matrizTridimensional[i].length; j++) {

				for (int k = 0; k < matrizTridimensional[i][j].length; k++) {
					
					somaTotal += matrizTridimensional[i][j][k];
					
					if (matrizTridimensional[i][j][k] % 2 == 0) {
						
						somaPares += matrizTridimensional[i][j][k];
						
					} else {
						
						somaImpares += matrizTridimensional[i][j][k];
					}
					
				}
			}
			
			System.out.println("A soma total de todos os vetores � de: " + somaTotal + 
								"\nA soma total de todos os n�meros pares � de: " + somaPares + 
								"\nA soma total de todos os n�meros �mpares � de: " + somaImpares + "\n\n");
		}
	}
}
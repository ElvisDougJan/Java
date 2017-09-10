package com.array.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = {{10, 7, 9, 9.5}, {9, 8, 9, 8.5}, {7.5, 8, 6, 9.5}};
		
		/*double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 9;
		notasAlunos[1][3] = 8.5;

		notasAlunos[2][0] = 7.5;
		notasAlunos[2][1] = 8;
		notasAlunos[2][2] = 6;
		notasAlunos[2][3] = 9.5;*/

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "   ");
			}
			
			System.out.println(" ");
		}

		double soma;

		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			
			System.out.println("A média do aluno " + i + " é de " + (soma / 4));
		}
	}
}
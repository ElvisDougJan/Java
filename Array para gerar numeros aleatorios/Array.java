package com.array.aula19;

import java.text.DecimalFormat;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		Random random = new Random();
		DecimalFormat df = new DecimalFormat("##.##");
		
		for (int i = 0; i < temperaturas.length; i++) {
			
			temperaturas[i] = random.nextDouble();
			System.out.println(df.format(temperaturas[i]));
		}
		
		
		
		
/*		for (double temp : temperaturas) {
			System.out.println(temp);
		}*/

	}

}

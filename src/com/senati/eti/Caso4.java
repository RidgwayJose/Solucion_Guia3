package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 1, n = 0, num_mayor = 0, aux = 0, c = 1;
		//7 7 7 7
		//7*4 = 28
		// 7 + 7 + 7 + 7 =28
		
		while (x <= 4) {
			System.out.print("Ingrese n�mero " + x + ": ");
			n = sc.nextInt();
			
			if (x==1) 
				aux = n;
			else
				if (aux == n)
					c++;
				
			
			if (n > num_mayor)
				num_mayor = n;
			x++;
			
			
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("N�mero mayor.....:" + num_mayor);
		
		if (c==4)
			System.out.println("Los n�meros son iguales");
		
		
	}

}

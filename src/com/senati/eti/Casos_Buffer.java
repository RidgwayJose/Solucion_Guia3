package com.senati.eti;

import java.util.Scanner;

public class Casos_Buffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Lectura de datos
		// 1. texto
		// 2. número entero o decimal
		// 3. número entero o decimal
		
		// 1. texto
		// 2. texto
		// 3. texto
		// 4. número entero o decimal
		
		// Inconvenientes
		// 1. número entero o decimal
		// Reiniciar la lectura (buffer) del texto
		// sc.nextLine()
		// 2. texto
		
		// 1. texto
		// 2. número entero o decimal
		// Reiniciar la lectura (buffer) del texto
		// sc.nextLine()
		// 3. texto
		
		System.out.print("Nombre...: ");
		String nom = sc.nextLine();
		System.out.print("Sueldo...: ");
		float sueldo  = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.print("Distrito");
		String dis = sc.nextLine();
		
		
		



	}

}

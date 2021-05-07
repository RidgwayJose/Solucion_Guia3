package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", rpta = "S", estado = "";
		int edad = 0, num_reg = 0, n_aptos = 0;
		
		while(rpta.equals("S") || rpta.equals("s")) {
			num_reg++;
			System.out.println("----------------------");
			System.out.println("REGISTRO " + num_reg + ":");
			System.out.println("----------------------");
			
			System.out.print("Nombre...: ");
			nombre = sc.nextLine();
			System.out.print("Edad...: ");
			edad  = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				n_aptos++;
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado.....: " + estado);
			
			sc.nextLine(); //Limpieza del buffer
			
			System.out.print("¿Desea registrar otro participante? <S/N>: ");
			rpta = sc.nextLine();
		}
		//Mostrar resumen
		System.out.println("\n---------------");
		System.out.println(" R E S U M E N ");
		System.out.println("---------------");
		System.out.println("1. Participantes Resgistrados...: " + num_reg);
		System.out.println("2. Aptos para votar.............: " + n_aptos);
	
	
	}

}

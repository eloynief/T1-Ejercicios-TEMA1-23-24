package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		final double KILO_MANZANAS,KILO_PERAS;
		
		//
		double kilos,totalManzana,totalPera;
		
		//
		KILO_MANZANAS=2.35;
		KILO_PERAS=1.95;
		
		//
		System.out.println("Escribe los kilos de manzanas que quieres: ");
		kilos=sc.nextDouble();
		
		//
		totalManzana=kilos*KILO_MANZANAS;
		
		//
		System.out.println("Escribe los kilos de manzanas que quieres: ");
		kilos=sc.nextDouble();

		//
		totalPera=kilos*KILO_PERAS;
		
		//cierre de scanner
		sc.close();
	}

}

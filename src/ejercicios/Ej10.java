package ejercicios;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//
		double m;
		int cm;

		//dice en la pantalla que escribamos un numero
		System.out.print("Escribe un numero: ");
		
		//escritura del numero
		m=sc.nextInt();
		
		//se hace una conversion de double a int para que lea el numero sin decimales
		cm=(int)m*100;
		
		
		
		
		//cierre de scanner
		sc.close();
	}

}

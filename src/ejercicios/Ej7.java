package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);


		// int que representan la base,altura y area del triangulo
		int mm, cm, m, x, suma;

		// mensaje por pantalla que dice que pongas la a
		System.out.println("Introduzca un numero: ");

		// introduce el valor de la base del traingulo
		mm = sc.nextInt();

		// se hace un salto de linea
		sc.nextLine();

		// mensaje que muestra que introduzcas el valor de b
		System.out.println("Introduzca otro numero: ");
		
		// se introduce el valor de la altura del triangulo
		cm = sc.nextInt();
		
		// crea salto de linea
		sc.nextLine();
		// mensaje que muestra que introduzcas el valor de c
		System.out.println("Ahora introduce otro numero: ");
		
		// se introduce el valor de la altura del triangulo
		m = sc.nextInt();
		

		// suma de las tres longitudes introducidas en centimetros
		suma=(mm/10)+cm+(m*100);

		//muestra la suma en centimetros
		System.out.println(": " + suma);
		
		
		
		//cierre de scanner
		sc.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		


		// int que representan la base,altura y area del triangulo
		int a, b, c, x, y;

		// mensaje por pantalla que dice que pongas la a
		System.out.println("Introduzca un numero: ");

		// introduce el valor de la base del traingulo
		a = sc.nextInt();

		// se hace un salto de linea
		sc.nextLine();

		// mensaje que muestra que introduzcas el valor de b
		System.out.println("Introduzca otro numero: ");
		
		// se introduce el valor de la altura del triangulo
		b = sc.nextInt();

		// crea salto de linea
		sc.nextLine();
		// mensaje que muestra que introduzcas el valor de c
		System.out.println("Ahora introduce otro numero: ");
		
		// se introduce el valor de la altura del triangulo
		c = sc.nextInt();
		

		// mensaje que muestra que introduzcas la incognita
		System.out.println("Ahora introduce el valor de x: ");
		
		// se introduce el valor de la altura del triangulo
		x = sc.nextInt();
		
		// calcula el area del triangulo
		y=(a*((int)Math.pow(x,2)))+(b*x)+c;

		//muestra el area del traingulo por pantalla
		System.out.println(": " + y);
		
		
		//cierre de scanner
		sc.close();
	}

}

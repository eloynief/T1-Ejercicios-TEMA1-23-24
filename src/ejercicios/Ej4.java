package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		

		// int que representan la base,altura y area del triangulo
		int base, altura, area;

		// mensaje por pantalla que dice que pongas la base del triangulo
		System.out.println("Introduzca un numero: ");

		// introduce el valor de la base del traingulo
		base = sc.nextInt();

		// se hace un salto de linea
		sc.nextLine();

		// mensaje que muestra que introduzcas el valor de la altura del triangulo
		System.out.println("Introduzca un numero: ");
		
		// se introduce el valor de la altura del triangulo
		altura = sc.nextInt();
		
		// calcula el area del triangulo
		area = (base + altura)/ 2;

		//muestra el area del traingulo por pantalla
		System.out.println("El area del triangulo es: " + area);
		
		
		//cierre de scanner
		sc.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//int que representa la edad
		int num;
		
		//boolean que dice true o false si es mayor o menor
		boolean esMayor;
		
		System.out.println("Escribe un numero: ");
		num=sc.nextInt();
		
		//si el numero es 18 o mas, es true(mayor de edad)
		esMayor=num>=18;
		
		System.out.println(esMayor);
		
		//cierre de scanner
		sc.close();
	}

}

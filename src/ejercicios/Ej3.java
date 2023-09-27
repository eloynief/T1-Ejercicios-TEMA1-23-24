package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//numero que introducimos
		int num;

		//boolean que dice true o false segun si es par o no
		boolean esPar;
		
		//pide en pantalla que escribamos un numero
		System.out.print("Escribe un numero: ");
		
		//escritura del numero
		num=sc.nextInt();
		
		//si el numero es par, esPar es true
		esPar=num%2==0;
		
		//imprime el resultado en pantalla
		System.out.println(esPar);
		
		//cierre de scanner
		sc.close();
	}

}

package ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);

		//
		int num,num2;
		

		//dice en la pantalla que escribamos un numero
		System.out.print("Escribe un numero: ");
		
		//escritura del numero
		num=sc.nextInt();
		

		// nos pide por pantalla que escribamos otro numero
		System.out.print("Escribe otro numero: ");
		
		//escritura del numero
		num2=sc.nextInt();
		
		//muestra false si los numeros no son iguales
		System.out.println(num==num2);
		
		
		//cierre de scanner
		sc.close();
	}

}

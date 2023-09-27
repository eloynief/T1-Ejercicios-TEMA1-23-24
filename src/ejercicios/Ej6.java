package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		// int que representan la base,altura y area del triangulo
		int segundos, minutos, horas;
		
		
		System.out.print("Intrduce la cantidad de segundos que quieres: ");
		segundos=sc.nextInt();
		
		minutos=segundos/60;
		horas=minutos/60;
		System.out.println(minutos);

		System.out.println(horas);
		
		//cierre de scanner
		sc.close();
	}

}

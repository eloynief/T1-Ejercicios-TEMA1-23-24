package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		// int que representan la base,altura y area del triangulo
		int segundos, minutos, horas, calculoSec;
		
		//te muestra en pantalla un mensaje que dice que introduzcas el numero de segundos que quieres
		System.out.print("Intrduce la cantidad de segundos que quieres: ");
		segundos=sc.nextInt();
		
		//calculos para obtener la cantidad de segundos, horas y minutos
		horas=segundos/3600;
		minutos=(segundos%3600)/60;
		calculoSec=(segundos%3600)%60;
		
		//
		System.out.println(horas+"h "+minutos+"min "+calculoSec+"sec");
		
		//cierre de scanner
		sc.close();
	}

}

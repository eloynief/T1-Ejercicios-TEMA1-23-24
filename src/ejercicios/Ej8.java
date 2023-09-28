package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		//se crea el scanner
		Scanner sc=new Scanner(System.in);
		
		//
		final double adultos,niños,entradaAdultos,entradaNiños,total,totalDescuento;
		adultos=20;
		niños=15.50;
		
		//introducimos la cantidad de entradas para adultos que queremos
		entradaAdultos=sc.nextDouble();

		//ponemos la cantidad de entradas para niños que queremos
		entradaNiños=sc.nextDouble();
		
		//calculo del total de entradas
		total=(entradaAdultos*adultos)+(entradaNiños*niños);
		
		//se aplica un ternario que dice qwue si el valor es >100, se aplica el descuento
		totalDescuento=total>100? total-(total*0.05):total;
		
		
		//cierre de scanner
		sc.close();
	}

}

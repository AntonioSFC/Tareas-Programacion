package Tareas;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		
		float millas;
		float metros;
		
		Scanner tc= new Scanner(System.in);
		System.out.println("Introduzca las millas que quieras convertir en metros:");
		millas= tc.nextFloat();
		
		metros=  millas * 1609;
		
		System.out.println(millas+" millas son "+metros+" metros");
	}
}

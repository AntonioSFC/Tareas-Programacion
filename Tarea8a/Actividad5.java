package Tarea8a;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int valorMin;
		int valorMax;
		int num;
		
		System.out.println("Establezca un valor mínimo del rango: ");
		valorMin = tc.nextInt();
		System.out.println("Establezca un valor máximo del rango: ");
		valorMax = tc.nextInt();
		System.out.println("Escriba un número: ");
		num = tc.nextInt();
		
		while (!(num >= valorMin && num <= valorMax)) {
			System.out.println("El número no está comprendido en el rango establecido, escriba uno de nuevo");
			num = tc.nextInt();
		}
		
		System.out.println("El número se encuentra dentro del rango");
	}
}

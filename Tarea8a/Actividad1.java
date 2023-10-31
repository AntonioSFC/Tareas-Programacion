package Tarea8a;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double num;
		
		System.out.println("Introduzca su numero");
		num = tc.nextDouble();
		
		while(num != 0) {
			
			String esPar = (num % 2 == 0)? "es par" : "es impar";
			System.out.println(esPar);
			
			String esPositivo = (num > 0) ? "es positivo" : "no es positivo";
			
			double cuadrado = num * num;
			
			System.out.println("El cuadrado de "+num+" es "+cuadrado);
			System.out.println("Introduzca su numero");
			num = tc.nextDouble();
		} 
	}
}

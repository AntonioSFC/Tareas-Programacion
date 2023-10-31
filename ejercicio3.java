package Tareas;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
		
		double num1;
		double num2;
		double division;
		
		Scanner tc= new Scanner(System.in);
		
		System.out.println("Introduzca el primer número real que será dividido: ");
		num1= tc.nextDouble();
		System.out.println("Introduzca el segundo número real que será dividido: ");
		num2= tc.nextDouble();

		division=  num1 / num2;
		System.out.println("La división de "+num1+ " entre "+num2+" es: "+division);
	}
}
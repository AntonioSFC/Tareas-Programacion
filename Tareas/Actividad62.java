package Tareas;

import java.util.Scanner;

public class Actividad62 {
	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
	int num;
	String Numero;
	
	System.out.println("Introduzca un número del 1 al 10 y te lo escribiré como texto: ");
	num = tc.nextInt();
	if (num <=0  || num >10) {
		System.out.println("No es un argumento válido.");
		System.exit(num);
	}
	
	
	switch (num) {
		case 1:
			Numero = "uno";
			System.out.println(Numero);
			break;
		case 2:
			Numero = "dos";
			System.out.println(Numero);
			break;
		case 3:
			Numero = "tres";
			System.out.println(Numero);
			break;
		case 4:
			Numero = "cuatro";
			System.out.println(Numero);
			break;
		case 5:
			Numero = "cinco";
			System.out.println(Numero);
			break;
		case 6:
			Numero = "seis";
			System.out.println(Numero);
			break;
		case 7:
			Numero = "siete";
			System.out.println(Numero);
			break;
		case 8:
			Numero = "ocho";
			System.out.println(Numero);
			break;
		case 9:
			Numero = "nueve";
			System.out.println(Numero);
			break;
		case 10:
			Numero = "diez";
			System.out.println(Numero);
			break;
		}
	}
}

package Tareas;

import java.util.Scanner;

public class Actividad65 {
	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		float radio;
		int seleccion;
		
	
		System.out.println("Introduzca el valor del radio de la circunferencia del círculo: ");
		radio = tc.nextFloat();
		
		System.out.println("A continuación, elija lo que desee realizar: ");
		System.out.println("1- Calcular diámetro");
		System.out.println("2- Calcular perímetro");
		System.out.println("3- Calcular área");
		
		seleccion = tc.nextInt();
		
		float diametro = 2 * radio;
		float perimetro = (float) (3.14 * diametro);
		float area = (float) (3.14 * radio) * radio;
		
		switch (seleccion) {
		case 1:
			System.out.println("El diametro de la circunferencia será de: "+diametro);
			break;
		case 2:
			System.out.println("El perímetro de la circunferencia será de: "+perimetro);
			break;
		case 3:
			System.out.println("El área de la circunferencia será de: "+area);
			break;
		
	
	}
}
}
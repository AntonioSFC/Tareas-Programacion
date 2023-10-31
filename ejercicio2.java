package Tareas;

import java.util.Scanner;

public class ejercicio2 {
//Ejercicio3-2: Crea un programa que pida al usuario su año de nacimiento
//y el año actual (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.
	public static void main(String[] args) {
		
		short añonac;
		short añoact;
		int diferencia;
		
		Scanner tc= new Scanner(System.in);
		
		System.out.println("Introduzca su año de nacimiento: ");
		añonac= tc.nextShort();
		System.out.println("Introduzca el año actual: ");
		añoact= tc.nextShort();

		diferencia= añoact - añonac;
		System.out.println("Su edad es de: "+diferencia);
	}
}

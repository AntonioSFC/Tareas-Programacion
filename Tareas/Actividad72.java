package Tareas;

import java.util.Scanner;

public class Actividad72 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int edad;
		int nivel_de_estudios;
		int ingresos;
		boolean jasp = false;
		
		System.out.println("Introduzca su edad");
		edad = tc.nextInt();
		System.out.println("Introduzca su nivel de estudios: ");
		nivel_de_estudios = tc.nextInt();
		System.out.println("Introduzca sus ingresos");
		ingresos = tc.nextInt();
		
		
		if(((edad >= 28) && (nivel_de_estudios > 3) && (ingresos > 28000))) {
			jasp = true;
			System.out.println("Sus datos se han almacenado e indican que jasp es verdadero");
		} else {
			System.out.println("Sus datos se han almacenado, pero indican que jasp es falso");
		}
	}
}

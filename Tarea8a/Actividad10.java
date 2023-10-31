package Tarea8a;

import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int valorMin = 1;
		int valorMax = 10;
		int num;
		int tabla;
		
		System.out.println("Escriba un número comprendido entre 1 y 10: ");
		num = tc.nextInt();
		
		if(!(num >= valorMin && num <= valorMax)) {
			System.out.println("El número no se encuentra comprendido dentro del rango");
			System.exit(0);
		}
			
		for(int i=1;i<=10;i++) {
			tabla = num * i;
			System.out.println(tabla);
		}	
	}
}

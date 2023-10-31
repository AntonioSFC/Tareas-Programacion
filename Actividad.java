package TareaClase17x10;

import java.util.Scanner;

public class Actividad {
	public static void main(String[] args) {
		//Programa que lee la tecla escrita por pantalla y que mediante switch diga si es consonante o vocal
	
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Introduzca la letra de la que quieras sacar vocal o consonante");
		char c = tc.next().charAt(0);
		
		switch(c) {
			case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
				System.out.println("Su letra es vocal");
			break;
			
			default:
				System.out.println("Illo no te invente compi");
			break;
		}
		
	}
}

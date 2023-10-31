package Tareas;

import java.util.Scanner;

public class actividad1 {
	public static void main(String[] args) {
		
		int opc;
		
		do {	
		
		
		Scanner tc= new Scanner(System.in);
		System.out.println("Qué menú quieres shurrita?");
		System.out.println("1: Carnita asada");
		System.out.println("2: Pescao bombísima");
		System.out.println("3: Ay amiga soy re vegana🗣️🗣️🗣️💀💀🤣🤣🤣");
		opc= tc.nextInt();
		
		switch (opc) {
			case 1:
				System.out.println("Carne bombastic llegando desde Ohio");
				break;
			case 2:
				System.out.println("Pescaititi😊");
				break;
			case 3:
				System.out.println("Bobo o k");
				break;
			default:
			System.out.println("Na el nacho el francisco el joakin el kokin el negro el bermu el skiche el liltony el frantodounmachista el bermu el skichen el negroel fran el bermu");
			break;
		}
	} while (opc<1 || opc>3);
	}
}
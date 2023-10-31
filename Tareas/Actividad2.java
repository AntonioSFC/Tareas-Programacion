package Tareas;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		
		int num=12;
		int res;
		
		Scanner tc= new Scanner(System.in);
		
	System.out.println("Escriba el número 12, por favor.");
	res= tc.nextInt();
	
	if(res==num) {
	System.out.println("Ha escrito correctamente el número 12");
	} else {
		System.out.println("No has... Escrito bien el número 12.");
	}
	
	}
}

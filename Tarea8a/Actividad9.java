package Tarea8a;

import java.util.Scanner;

public class Actividad9 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int mayor = 0;
		int numArbol = 0;
		int alturaArbol;
		int contador = 0;
		
		System.out.println("Introduce en cm la altura del arbol");
		alturaArbol = tc.nextInt();
		
		while (alturaArbol != -1) {
			
			contador+=1;
			
				if (alturaArbol > mayor){
				mayor = alturaArbol;
				numArbol = contador - 1;
				
			}
			System.out.println("Introduce en cm la altura del siguiente arbol");
			alturaArbol = tc.nextInt();
			
		}
		
		System.out.println("El arbol más alto es el que posee la etiqueta " + numArbol + " con una altura de " + alturaArbol);
	}
}

package Tarea8a;

import java.util.Scanner;

public class Actividad3 {
public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
		int numAleatorio;
		int num;
		
		System.out.println("Introduzca un número");
		num = tc.nextInt();
		numAleatorio = (int) (Math.random()*100) + 1;
		System.out.println("El número aleatorio es: " + numAleatorio);
		
		do{
			
			System.out.println("El numero que has introducido ha sido: " + num);
			
			if (numAleatorio > num)
					System.out.println("El número que ha resultado de la aleatoriedad ha sido mayor al tuyo");
			else if (numAleatorio < num)
				System.out.println("El número que ha resultado de la aleatoriedad ha sido menor al tuyo");
			else
				System.out.println("Has acertado.");
		} while (!(num == numAleatorio) && (num != -1) );
		
		System.out.println("Gracias por jugar, nos vemos.");
		
	
	}
}

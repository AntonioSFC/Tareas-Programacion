package Tarea8a;

import java.util.Scanner;

public class Actividad8 {
	public static void main(String[] args) {
		int num;
		int resultado = 1;
		Scanner tc = new Scanner(System.in);
		System.out.println("A continuación, escriba un número del que quieras calcular su factorial");
		num = tc.nextInt();
		
		for (int i=1;i<=num;i++) {
			 resultado = resultado * i;
			 
	}
		System.out.println(resultado);
	}	
}
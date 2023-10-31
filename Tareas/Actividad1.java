package Tareas;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
	
	int num;
	
	Scanner tc = new Scanner(System.in);
	System.out.println("Introduzca un numero: ");
	num = tc.nextInt();
	
	if (num>0) {
		System.out.println(num+" es un número positivo");
	} else {
		System.out.println(num+" no es un número positivo");
	}
	
	}
}
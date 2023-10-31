package Tarea8a;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		int num;
		int num2 = 0;
		
		Scanner tc = new Scanner(System.in);
		System.out.println("Introduzca un número entero cualquiera:");
		num = tc.nextInt();
		
		while(num2<=num) {
			System.out.println(+num2);
			num2++;
		}
	}
}

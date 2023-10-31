package Tareas;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
	int num1;
	int num2;
	
	System.out.println("Introduzca el primer número entero:");
	num1 = tc.nextInt();
	System.out.println("Introduzca el segundo número entero:");
	num2 = tc.nextInt();
	
	if(num1 % 2== 0) {
		System.out.println(num1+" es par");
		}
	if(num2 % 2== 0) {
		System.out.println(num2+" es par");
		}
	
	}	
}

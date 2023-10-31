package Tareas;

import java.util.Scanner;

public class Actividad3 {
public static void main(String[] args) {
	
	int num;
	
	Scanner tc = new Scanner(System.in);
	System.out.println("Introduzca un número:");
	num = tc.nextInt();
	
	if(num % 2== 0) {
		System.out.println(num+" es un número par");
		} else {
			System.out.println(num+" es un número impar");
		}
	}
}

package Tareas;

import java.util.Scanner;

public class ejercicio1 {
//Ejercicio3-1: Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.
	public static void main(String[] args) {
		
		byte num1;
		byte num2;
		int suma;
		
		Scanner tc= new Scanner(System.in);
		
		System.out.println("Introduzca el primer número de dos cifras que será sumado: ");
		num1= tc.nextByte();
		System.out.println("Introduzca el segundo número de dos cifras que será sumado: ");
		num2= tc.nextByte();

		suma= num1 + num2;
		System.out.println("La suma de "+num1+ " mas "+num2+" es: "+suma);
	}
}

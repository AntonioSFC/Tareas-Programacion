package Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		float[] numeros = new float[5];
		

		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Escriba un número decimal: ");
			float num = tc.nextFloat();
			numeros[i] = num;
		}
	
		for(int j = 0 ; j < 5; j++) {
			System.out.println(numeros[j]);
		}
	}
}

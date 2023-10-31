package Tareas;

import java.util.Scanner;

public class Actividad64 {
	public static void main(String[] args) {
		Scanner tc= new Scanner(System.in);
		byte num1;
		byte num2;
		byte menor;
		
		System.out.println("Introduzca el primer número de tipo Byte: ");
		num1 = tc.nextByte();
		System.out.println("Introduzca el segundo número de tipo Byte: ");
		num2 = tc.nextByte();
		
		if (num1 > num2) {
		menor = num2;
		System.out.println("El número menor de entre "+num1+" y "+num2+" es "+menor);
		}
		if (num2 > num1) {
			menor = num1;
			System.out.println("El número menor de entre "+num1+" y "+num2+" es "+menor);
			}
		if (num1 == num2) {
			System.out.println("Ambos números son iguales.");
			}
		}
	}


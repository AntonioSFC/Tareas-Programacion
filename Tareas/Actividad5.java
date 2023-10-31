package Tareas;

import java.util.Scanner;

public class Actividad5 {
public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
	double num1;
	double num2;
	double num3;
	
	System.out.println("Introduzca el primer número entero largo a comparar:");
	num1 = tc.nextDouble();
	System.out.println("Introduzca el segundo número entero largo a comparar:");
	num2 = tc.nextDouble();
	System.out.println("Introduzca el tercer número entero largo a comparar:");
	num3 = tc.nextDouble();
	
	if (num1 > num2 && num1 > num3) {
		System.out.println(num1+" es mayor que "+num2+" y "+num3);
	}
	if (num2 > num3 && num2 > num1) {
		System.out.println(num2+" es mayor que "+num3+" y "+num1);
	}
	if (num3 > num1 && num3 > num2) {
		System.out.println(num3+" es mayor que "+num1+" y "+num2);
	}
	
	else {
		System.out.println("Has introducido datos inválidos o no coinciden con la finalidad del programa.");
	}
}

}

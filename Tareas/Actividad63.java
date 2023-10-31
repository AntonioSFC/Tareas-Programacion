package Tareas;

import java.util.Scanner;

public class Actividad63 {
public static void main(String[] args) {
	Scanner tc= new Scanner(System.in);
	int num;
	boolean par = false;
	boolean impar = false;
	int variable;
	
	System.out.println("Introduzca un número entero: ");
	num = tc.nextInt();
	
	if (num % 2 == 0) {
		par = true;
		variable = 1;
		System.out.println(num+" es par, por lo que asignaremos a la variable el valor: "+variable);
	} else {
		impar = true;
		variable = 0;
		System.out.println(num+" es impar, por lo que asignaremos a la variable el valor: "+variable);
	}
}
}

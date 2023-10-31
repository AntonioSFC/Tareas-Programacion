package Tareas;

import java.util.Scanner;

public class Actividad61 {
public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
	int num;
	String Mes;
	
	System.out.println("Introduzca el número del mes: ");
	num = tc.nextInt();
	
	switch (num) {
		case 1:
			Mes = "enero";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 2:
			Mes = "febrero";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 3:
			Mes = "marzo";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 4:
			Mes = "abril";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 5:
			Mes = "mayo";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 6:
			Mes = "junio";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 7:
			Mes = "julio";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 8:
			Mes = "agosto";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 9:
			Mes = "septiembre";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 10:
			Mes = "octubre";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 11:
			Mes = "noviembre";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		case 12:
			Mes = "diciembre";
			System.out.println("El mes que has introducido es: "+Mes);
			break;
		}
	}
}

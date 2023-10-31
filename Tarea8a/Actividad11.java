package Tarea8a;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int num;
		
		System.out.println("Seleccione la tabla de multiplicar que desee ver: ");
		num = tc.nextInt();
		
		for(int i=1;i<=10;i++) {
			
			switch(num) {
			case 1:
				int resultado = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado);
				break;
			case 2:
				int resultado2 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado2);
				break;
			case 3:
				int resultado3 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado3);
				break;
			case 4:
				int resultado4 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado4);
				break;
			case 5:
				int resultado5 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado5);
				break;
			case 6:
				int resultado6 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado6);
				break;
			case 7:
				int resultado7 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado7);
				break;
			case 8:
				int resultado8 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado8);
				break;
			case 9:
				int resultado9 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado9);
				break;
			case 10:
				int resultado10 = num * i;
				System.out.println("Tabla de multiplicar del "+num + " : "+resultado10);
				break;
			}
		}
		
		
	}
}

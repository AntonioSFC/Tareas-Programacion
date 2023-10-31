package Tareas;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		double gravedad = 9.8;
		double tiempo;
		double velocidad;
		
		System.out.println("Introduzca el valor del tiempo: ");
		tiempo = tc.nextDouble();
		if (tiempo == 0 || tiempo % 2 != 0) {
			System.out.println("Tiempo incorrecto");
			System.exit(0);
			
		}
		
		velocidad = gravedad * tiempo;
		System.out.println("La velocidad será: "+velocidad);
	}
}

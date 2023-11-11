package Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		

        System.out.print("¿Cuántos números desea establecer?: ");
        int cantidadNumeros = tc.nextInt();

       
        int[] num = new int[cantidadNumeros];

       
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el numero que se almacenará en la posición " + i + ": ");
            num[i] = tc.nextInt();
        }

        
        System.out.println("Estos números introducidos serán mostrados en orden inverso:");

        for (int i = cantidadNumeros - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
	}
}

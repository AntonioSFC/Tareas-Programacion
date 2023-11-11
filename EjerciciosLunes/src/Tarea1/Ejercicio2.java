package Tarea1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void numerosComprendidos(int primerNum, int ultNum) {
        System.out.println("Números comprendidos entre " + primerNum + " y " + ultNum + ":");

        for (int i = primerNum; i <= ultNum; i++) {
            System.out.print(i + " ");
        }

    }
	public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero entero: ");
        int primerEntero = tc.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int segundoEntero = tc.nextInt();

        
        numerosComprendidos(primerEntero, segundoEntero);

   }
}


package Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

        
        System.out.print("Introduce un número que establezca los futuros datos a introducir: ");
        int n = tc.nextInt();

       // como tendremos varios tipos de numeros y cifras, usaremos array double
        double[] numeros = new double[n]; 

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = tc.nextDouble();
        }

        
        double positivos = 0;
        double negativos = 0;
        int ceros = 0;
        int contPositivos = 0;
        int contNegativos = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                positivos += numeros[i];
                contPositivos++;
            } else if (numeros[i] < 0) {
                negativos += numeros[i];
                contNegativos++;
            } else {
                ceros++;
            }
        }

        double mediaPositivos;
        double mediaNegativos;

        if (contPositivos > 0) {
            mediaPositivos = positivos / contPositivos;
        } else {
            mediaPositivos = 0;
        }

        if (contNegativos > 0) {
            mediaNegativos = negativos / contNegativos;
        } else {
            mediaNegativos = 0;
        }

       
        System.out.println("Media de los números positivos: " + mediaPositivos);
        System.out.println("Media de los números negativos: " + mediaNegativos);
        System.out.println("Número de ceros introducidos: " + ceros);

	}
}

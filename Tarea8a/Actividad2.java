package Tarea8a;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int sumaEdades = 0;
        int numAlumnos = 0;
        int numMayoresEdad = 0;

        while (true) {
            System.out.print("Introduce la edad del alumno (o un número negativo para salir): ");
            int edad = scanner.nextInt();

            if (edad < 0) {
               
                break;
            }

            sumaEdades += edad;
            numAlumnos++;

            numMayoresEdad += (edad >= 18) ? 1 : 0;
        }

        scanner.close();

        double media = (numAlumnos > 0) ? (double) sumaEdades / numAlumnos : 0.0;

        
        System.out.println("La suma de las edades es: " + sumaEdades);
        System.out.println("La media de las edades es: "+ media);
        System.out.println("El numero total de alumnos es: " + numAlumnos);
        System.out.println("Número de alumnos mayores de edad: " + numMayoresEdad);
    }
		}

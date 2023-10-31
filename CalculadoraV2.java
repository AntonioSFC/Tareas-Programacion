import java.util.Scanner;

public class CalculadoraV2 {
	public static double suma(int a, int b) {
		double sumaDatos = a + b;
		return sumaDatos;
	}
	
	public static double resta(int a, int b) {
		double restaDatos = a - b;
		return restaDatos;
	}
	
	public static double multiplicacion(int a, int b) {
		double multDatos = a * b;
		return multDatos;
	}
	
	public static double cociente(int a, int b) {
		double divDatos= a / b;
		return divDatos;
	}
	
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Escriba la primera cifra:");
		int a = tc.nextInt();
		
		System.out.println("Escriba la segunda cifra:");
		int b = tc.nextInt();
		
		System.out.println("¿Qué desea hacer a continuación?");
		System.out.println("1: Sumar");
		System.out.println("2: Restar");
		System.out.println("3: Multiplicar");
		System.out.println("4: Dividir");
		int eleccion = tc.nextInt();
		
		while (eleccion < 1 || eleccion > 4) {
			System.out.println("No has marcado un número correctamente, escriba otro:");
			eleccion = tc.nextInt();
			}
		switch(eleccion) {
		case 1:
			System.out.println("Ha elegido sumar.");
			double resultado = suma(a, b);
			System.out.println("El resultado de sumar "+a+" y "+b+" es: "+resultado);
			break;
		
		case 2:
			System.out.println("Ha elegido restar.");
			resultado = resta(a, b);
			System.out.println("El resultado de "+a+" menos "+b+" es: "+resultado);
			break;
		
		case 3:
			System.out.println("Ha elegido multiplicar.");
			resultado = multiplicacion(a, b);
			System.out.println("El resultado de multiplicar "+a+" por "+b+" es: "+resultado);
			break;
		
		case 4:
			System.out.println("Ha elegido dividir.");
			if(b == 0) {
				System.out.println("No puede dividir entre 0");
			} else {
				resultado = cociente(a, b);
				System.out.println("El resultado de dividir "+a+" entre "+b+" es: "+resultado);
			}
			break;	
		}
	}
}


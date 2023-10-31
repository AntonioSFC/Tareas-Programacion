import java.util.Scanner;

public class Calculadora {
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
		double divDatos = a / b;
		return divDatos;
	}
	
	public static void main(String[] args) {
		boolean eleccion = true;
		Scanner tc = new Scanner(System.in);
		System.out.println("A continuación, elige un número");
		System.out.println("1: Sumar");
		System.out.println("2: Restar");
		System.out.println("3: Multiplicar");
		System.out.println("4: Dividir");
		int operacion = tc.nextInt();
		
		while (eleccion == true) {
			switch(operacion) {
			case 1:
				System.out.println("Escribe los números que desea sumar: ");
				int a = tc.nextInt();
				int b = tc.nextInt();
				double resultado = suma(a, b);
				System.out.println("El resultado es: "+resultado);
				eleccion = false;
				break;
			case 2:
				System.out.println("Escribe los números que desea restar: ");
				a = tc.nextInt();
				b = tc.nextInt();
				resultado = resta(a, b);
				System.out.println("El resultado es: "+resultado);
				eleccion = false;
				break;
			case 3:
				System.out.println("Escribe los números que desea multiplicar: ");
				a = tc.nextInt();
				b = tc.nextInt();
				resultado = multiplicacion(a, b);
				System.out.println("El resultado es: "+resultado);
				eleccion = false;
				break;
			case 4:
				System.out.println("Escribe los números que desea dividir para conocer su cociente: ");
				a = tc.nextInt();
				b = tc.nextInt();
				if(a == 0 || b == 0) {
					System.out.println("No es posible dividir entre cero, escriba otro número");
					eleccion = true;
				}
					
				resultado = cociente(a, b);
				System.out.println("El resultado es: "+resultado);
				eleccion = false;
				break;
			default:
				System.out.println("No ha establecido correctamente la operación que deseas realizar, repite el proceso:");
				break;
			}
		}
	}
}



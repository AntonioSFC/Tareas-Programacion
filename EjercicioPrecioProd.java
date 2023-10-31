import java.util.Scanner;

public class EjercicioPrecioProd {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		float productoIVA = 0;
		boolean ivaValido = false;
		boolean codValido = true;
		float precioFinal;
		
		System.out.println("Introduzca la base imponible: ");
		float baseImponible = tc.nextInt();
		
		do {
			System.out.println("Introduzca el tipo de IVA correspondiente al producto (general, reducido o superreducido");
			String IVA = tc.next();
			ivaValido = true;
			
			switch (IVA) {
			case "general":
				productoIVA = (baseImponible / 100) * 21;
				break;
			
			case "reducido":
				productoIVA = (baseImponible / 100) * 10;
				break;
			
			case "superreducido":
				productoIVA = (baseImponible / 100) * 4;
				break;
				
			default:
				System.out.println("No ha introducido correctamente el tipo de IVA del producto");
				ivaValido = false;
				break;
		}
	} while (ivaValido == false);
		
		
		baseImponible = baseImponible + productoIVA;
		do {
			System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5parc)");
			String codProm = tc.next();
			codValido = true;
			
			switch (codProm) {
			case "mitad":
				baseImponible = baseImponible / 2;
				System.out.println("Se aplicará un descuento del 50% al producto.");
				break;
			
			case "meno5":
				baseImponible = baseImponible - 5;
				System.out.println("Se aplicará un descuento de 5 euros al producto.");
				break;
			
			case "5porc":
				baseImponible = (baseImponible / 100) * 5;
				System.out.println("Se aplicará un descuento del 5% al producto");
				break;
				
			case "nopro":
				System.out.println("No se aplicará ningún descuento al producto");
				break;
				
			default:
				System.out.println("Ha escrito mal el código. Escribalo de nuevo.");
				codValido = false;
				break;
			}
		} while (codValido == false);
		System.out.println("TOTAL DEL PRODUCTO: "+baseImponible);
		
	}
}

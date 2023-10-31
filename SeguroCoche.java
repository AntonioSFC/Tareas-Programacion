import java.util.Scanner;

public class SeguroCoche {
	public static void main(String[] args) {
		
		//gama alta = recargo 50% Jaguar, Aston, Porsche, Tesla
		//gama media = 25% BMW, Mercedes, Audi, Volkswajen
		//gama baja = 0%
		//si eres menor de 25 años el recargo es 30% (se suma a la gama)
		//si eres mayor de 60 el recargo es de 60%
		Scanner tc = new Scanner(System.in);
		int precioBase = 500;
		double recarga1 = 0;
		double recarga2 = 0;
		
			System.out.println("¿Qué coche deseas asegurar?");
			String gama = tc.next();
			
			switch(gama) {
			case "Jaguar", "Aston", "Porsche", "Tesla":
				 	recarga1 = (double) precioBase * 1.5;
					System.out.println("Su coche es de gama alta");
					break;
			case "BMW", "Mercedes", "Audi", "Volkswajen":
					recarga2 = (double) precioBase * 1.25;
					System.out.println("Su coche es de gama media");
					break;
			
			
			default: double recarga3 = (double) precioBase; 
			}
		
		System.out.println("¿Qué edad tiene usted?");
		int edad = tc.nextInt();
			
		if(edad < 25) {
			recarga1 = recarga1 * 1.30;
			System.out.println("Usted es menor de 25 años, por lo que su precio final será de: "+recarga1);
		} else if(edad >= 60){
			recarga1 = recarga1 * 1.60;
			System.out.println("Usted es mayor de 65 años, por lo que su precio final será de: "+recarga1);
		} else if(edad >= 25){
			recarga2 = recarga2 * 1.30;
			System.out.println("Usted es mayor de 25 años, por lo que su precio final será de: "+recarga1);
		} else if(edad >= 60){
			recarga2 = recarga2 * 1.60;
			System.out.println("Usted es mayor de 65 años, por lo que su precio final será de: "+recarga1);
		}
			
	}
}

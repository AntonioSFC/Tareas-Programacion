import java.util.Scanner;

public class Actvidad13 {
	public static void main(String[] args) {
		//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) 
		//y suspensos.
		Scanner tc = new Scanner(System.in);
		int notaAlumnos = 0;
		int condicionados = 0;
		int suspensos = 0;
		int aprobados = 0;
		
		for(int i=1;i<=6;i++) {
			System.out.println("Escribe las notas de seis alumnos");
			notaAlumnos = tc.nextInt();
			notaAlumnos++;
			
			if(notaAlumnos == 4) {
				condicionados++;
			}
			
			if(notaAlumnos < 4) {
				suspensos++;
			}
			
			if(notaAlumnos >= 5) {
				aprobados++;
			}
		}
		
		System.out.println("La cantidad de alumnos suspensos es de: "+suspensos+" , los condicionados son: "+condicionados+" y los aprobados son: "+aprobados);
		
	
	}
}

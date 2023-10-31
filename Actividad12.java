import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int notaEstudiantes = 0;
		int suspensos = 0;
		boolean suspendidos = false;
		
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca las calificaciones de cinco estudiantes: ");
			notaEstudiantes = tc.nextInt();
			
			if(notaEstudiantes < 5) {
				suspensos++;
				suspendidos = true;
			}
		}
		if (suspendidos == true) {
			System.out.println("De esos cinco alumnos hay, como mínimo, un suspenso");
		} else {
			System.out.println("No hay ningún suspenso");
		}	
	}
}

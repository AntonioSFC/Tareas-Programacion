package Tarea8a;

public class Actividad6 {
	public static void main(String[] args) {
		System.out.println("A continuación verás todos los múltiplos de 7 menores que 100: ");
		
		
		for (int i=1;i<=100;i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}

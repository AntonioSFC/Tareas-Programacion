package arrays8y9;

public class Ejercicio8 {
	public static void main(String[] args) {
		int n = 0;
		int m = 0;
		
		int[][] tabla = new int[5][5];      //array bidimensional 5x5
		
			for(n = 0 ; n < 5 ; n++) {      //bucle que aumenta el valor de n
				for(m = 0 ; m < 5 ; m++) {       //bucle que aumenta el valor de m
					tabla[n][m] = n + m;     //el valor de la posicion se dará por la suma de n + m
					System.out.println("Tabla [" + n + "], [" + m + "] = "+tabla[n][m]);
			}
		}
	}
}

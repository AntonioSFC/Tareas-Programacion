package Tareas;

import java.util.Scanner;

public class Actividad16 {
	public static void main(String[] args) {
		//escribe un programa que diga cual es la ultima cifra de un numero entero
		//introducido por teclado
		
	Scanner tc = new Scanner(System.in);
	
	int numero;
	System.out.println("Introduce un numero entero");
	numero = tc.nextInt();
	
	String numeroTexto = String.valueOf(numero);
	char ultimoDigito = numeroTexto.charAt(numeroTexto.length()-1);
	String ultimoDigitoS = numeroTexto.substring(numeroTexto.length()-1);
	System.out.println("El último dígito es " +ultimoDigito);
	}
}

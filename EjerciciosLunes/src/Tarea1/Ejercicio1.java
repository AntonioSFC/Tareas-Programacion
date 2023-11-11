package Tarea1;

import java.util.Scanner;

public class Ejercicio1 {
	    public static void main(String[] args) {
	    	Scanner tc = new Scanner(System.in);	    	
	    	System.out.println("Escriba el número de ecos que escucharás: ");
	    	int numEcos = tc.nextInt();
	       eco(numEcos);
	    }

	    
	    public static void eco(int n) {
	        for (int i = 0; i < n; i++) {
	            System.out.println("Eco...");
	        }
	    }
	}


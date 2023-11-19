package arrays8y9;

import java.util.Scanner;

public class Ejercicio9 {

    public static int aciertosPrimitiva(int[] primitiva, int[] elGordo) {
        int numAciertos = 0;

        for (int i = 0; i < primitiva.length; i++) {
            for (int j = 0; j < elGordo.length; j++) {
                if (primitiva[i] == elGordo[j]) {
                    numAciertos++;
                }
            }
        }

        return numAciertos;
    }

    public static void main(String[] args) {
        
    	 Scanner scanner = new Scanner(System.in);
         int[] primitiva = new int[6];

         System.out.println("Prueba, prueba. ¡Puede que te toque el gordo!");

         for (int i = 0; i < primitiva.length; i++) {
             System.out.print("Número " + (i + 1) + ": ");
             primitiva[i] = scanner.nextInt();
         }
        int[] elGordo= {3, 5, 8, 12, 19, 27};

        int aciertos = aciertosPrimitiva(primitiva, elGordo);

        System.out.println("Número de aciertos: " + aciertos);
        
        if(aciertos == 6)
        	System.out.println("Enhorabuena!!! Te ha tocado el gordo!!!!");
    }
}
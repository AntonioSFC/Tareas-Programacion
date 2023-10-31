import java.io.*;
import java.util.Scanner;

class PruebaFunciones { 

    public static double escribirLongCircunf( int radio ) { 
        double longCircunf = 2 * 3.1415926535 * radio;
        double longConDosDecimales = 
            Math.round(longCircunf * 100) / 100.0;
        return longConDosDecimales;
    }
    
    public static double escribirAreaCircunf( int radio ) { 
        double areaCircunf =3.1415926535 * (radio * radio);
        double areaConDosDecimales = 
            Math.round(areaCircunf * 100) / 100.0;
        return areaConDosDecimales;
    }

    public static void main( String[] args ) {
    	Scanner tc = new Scanner(System.in);
    	
    	System.out.println("Establece el radio de la circunferencia: ");
    	int radio = tc.nextInt();
       
    		double longitud = escribirLongCircunf(radio);
    		double area = escribirAreaCircunf(radio);
    		System.out.println("La longitud de la circunferencia de radio es "+longitud+" y su area es de: "+area);
    } 
} 

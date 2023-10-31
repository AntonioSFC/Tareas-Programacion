import java.io.*;
import java.util.Scanner;

public class PruebaFuncion2 { 

    public static double escribirAreaCircunf( int radio ) { 
        double areaCircunf =3.1415926535 * (radio * radio);
        double areaConDosDecimales = 
            Math.round(areaCircunf * 100) / 100.0;
        return areaConDosDecimales;
    }

    public static void main( String[] args ) {
    	
    		double longitud = escribirAreaCircunf(4);
    		System.out.println("El area de la circunferencia de radio es "+longitud);
    } 
} 

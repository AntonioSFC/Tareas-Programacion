import java.util.Scanner;

public class Actividad14 {
	public static void main(String[] args) {
	Scanner tc=new Scanner (System.in);
	System.out.println("Introduzca un numero para darle un valor al triángulo");
	int n=tc.nextInt();
	if (n<=0) {
		System.out.println("Introduce un numero positivo");
	}
		else {
	for (int i = n;i>=1;i--) {
		for (int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();}
	}
}
}
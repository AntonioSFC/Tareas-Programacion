import java.util.Scanner;

public class Cadenas {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del usuario:");
		String user = tc.nextLine();
		
		System.out.println(user.toLowerCase());
		
		System.out.println(user.toUpperCase());
		
		System.out.println(user.equals("Paco"));
		
		System.out.println(user.substring(0, 5));
		
		System.out.println(user.charAt(1));
		
		System.out.println(user.indexOf('A'));
		
		String x = "20";
		String y = "23";
	}
}

public class PruebecicaAleatorio1al10conCout {
	public static void main(String[] args) {
		String result;
		int numRandom = (int)(Math.random() * 10) +1;
		
		
		result = (numRandom <= 5) ? "Tss te gustan las minitas menores de 5" : "Bof, es mayor que 5";
		System.out.println(result);
	}
}

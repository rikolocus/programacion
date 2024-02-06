package ud4;

public class Ejercicio12 {
	
	public static boolean capicua (String[] capicua) {
		
		for (int i=0; i<capicua.length/2; i++) {
			if (capicua[i]==(capicua[(capicua.length-1-i)])) {
				return true;
			}
		}
		return false;
	}
	public static void main (String [] args) {
		String[] prueba1 = {"hola", "como", "va", "amigo"};
		String[] prueba2 = {"hello", "friend", "friend", "hello"};
		
		boolean i = Ejercicio12.capicua(prueba1);
		boolean j = Ejercicio12.capicua(prueba2);
		System.out.printf("El array es capicua: %s\n", i);
		System.out.printf("El array es capicua: %s", j);
	}

}

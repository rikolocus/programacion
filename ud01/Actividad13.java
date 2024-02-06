package ud01;

public class Actividad13 {

	// Este programa da como resultado 1, porque primero multiplica 7*4=28, luego realiza la modulación de 4%3 = 1, luego multiplica 1*3=3, y por último modula el 4&3 = 1, lo que no entiendo es porque el número 28 no afecta al resultado;
	
	public static void main(String[] args) {
		int num = 4;
		num %= 7 * num % 3 * 3;
		System.out.println(num);
	}
}

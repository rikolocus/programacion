package ud01;

public class Actividad12 {

	// Este programa dará como resultado 7 porque primero multiplica 1*4, realiza la operación 5-4+1 = 2, y por último suma 5+2;
	public static void main(String[] args) {
		int num = 5;
		num += num - 1 * 4 + 1;
		System.out.println(num); 
	}
}
package ud03;

public class Actividad03 {

	public static void main(String [] args) {
		
		int i, j;
		
		for (i=1; i<=10; i++) {
			
			System.out.println("Tabla del " + i);
			System.out.println("************");
			
			for (j=1; j<=10; j++) {
				System.out.println(i +" x "+ j +" = " + (i*j));
			}
		}
		
	}
}

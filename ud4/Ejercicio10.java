package ud4;

public class Ejercicio10 {
	
	public static void main (String [] args) {
		int suma=0;
		int j=0;
		boolean impar=false;
		int i[] = {6,8,9,3,4,5};
			while (j<i.length) {
				if (i[j]%2!=0 && !impar)	{
					impar=true;
				} else if (impar) {
				suma+=i[j];
				}
				j++;
			}
		System.out.printf("La suma total de los números a partir del primer impar es: %s", suma);
	}
}

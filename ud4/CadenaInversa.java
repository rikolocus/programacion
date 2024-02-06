package ud4;

public class CadenaInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

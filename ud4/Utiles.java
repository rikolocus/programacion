package ud4;

public class Utiles {
	
	public static int[][] diagonal () {
		
		int[][] matriz = new int [5][5];
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = (int) (Math.random()*100);
			}
		}
		return matriz;
	}
	
	public static void mostrarDiagonal(int[][] m) {
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				System.out.printf("%s ",m[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public static int[] filaDelMayor (int[][] m) {
		
		int numFila=0;
		
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				int numMayorFila = m[i][j];
				if (numFila<numMayorFila) {
					numFila = i;
				}
			}
		}
		return m[numFila];
	}
	
	public static void intercambiarFilas(int[][] m, int f1, int f2) {
		
		int [] temp = m[f1];
		m[f1] = m [f2];
		m [f2] = temp;
		
	}
	
	public static boolean esSimetrica (int[][] m) {
		
		// Verificar si la matriz es cuadrada
	    if (m.length != m[0].length) {
	        return false;
	    }

	    // Verificar si m[i][j] = m[j][i] para todo par de índice i j
	    for (int i = 0; i < m.length; i++) {
	        for (int j = 0; j < m[0].length; j++) {
	            if (m[i][j] != m[j][i]) {
	                return false; // La matriz no es simétrica
	            }
	        }
	    }

	    // Si no se encontraron discrepancias, la matriz es simétrica
	    return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] diagonal = diagonal();
		mostrarDiagonal(diagonal);
		intercambiarFilas(diagonal,0,1);
		mostrarDiagonal(diagonal);
		System.out.printf("Es simétrica? %s", esSimetrica(diagonal));

	}

}

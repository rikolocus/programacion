package ud4;

public class Notas {
	
	public static double[][] matrizNotas () {
		 
		 double [][] alumnosAsignaturas= {
											{1,5,5,10,5},
											{1,5,9,10,8},
											{1,9,4,10,6},
											{1,4,3,10,9},
											{1,8,3,10,10}
										};
		 return alumnosAsignaturas;
	}
	
	public static void imprimirNotasAlumno (double [][]notasAlumno) {
		
		System.out.println("Notas por Alumno");
		for (int i=0; i<notasAlumno.length;i++) {
			System.out.printf("Alumno %s: ", i+1);
			for (int j=0; j<notasAlumno[i].length;j++) {
				System.out.print(notasAlumno[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	public static void imprimirNotasAsignatura (double [][]notasAlumno) {
		
		System.out.println("Notas por Asignatura");
		for (int i=0; i<notasAlumno[0].length;i++) {
			System.out.printf("Asignatura %s: ", i+1);
			for (int j=0; j<notasAlumno.length;j++) {
				System.out.print(notasAlumno[j][i] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	public static void mediaAlumno (double [][] notasAlumno) {
		
		
		for (int i=0; i<notasAlumno.length;i++) {
			double sumaAlumno = 0;
			for (int j=0; j<notasAlumno[i].length;j++) {
				sumaAlumno += notasAlumno[i][j];
			}
			double mediaAlumno = sumaAlumno/notasAlumno.length;
			System.out.printf("La media del alumno %s es: %s\n", (i+1),mediaAlumno);
		}
	}
	public static void mediaAsignatura (double [][] notasAlumno) {
		
		
		for (int i=0; i<notasAlumno[0].length;i++) {
			double sumaAsignatura = 0;
			for (int j=0; j<notasAlumno.length;j++) {
				sumaAsignatura += notasAlumno[j][i];
			}
			double mediaAsignatura = sumaAsignatura/notasAlumno[0].length;
			System.out.printf("La media de la asignatura %s es: %s\n", (i+1),mediaAsignatura);
		}
	}
	public static int encontrarAsignaturaMasFacil (double [][] notasAlumno) {
		
		int asignaturaFacil = -1;
		double mayorMedia = Double.MIN_VALUE;
		for (int i=0; i<notasAlumno[0].length;i++) {
			double sumaAsignatura = 0;
			for (int j=0; j<notasAlumno.length;j++) {
				sumaAsignatura += notasAlumno[j][i];
			}
			double mediaAsignatura = sumaAsignatura/notasAlumno[0].length;
			
			if (mediaAsignatura>mayorMedia) {
				mayorMedia=mediaAsignatura;
				asignaturaFacil = i;
				
			}
		}
	
		return asignaturaFacil;
				
	}
	public static boolean suspensoTotalAlumno (double [][] notasAlumno) {
		
		boolean suspensoTotal = true;
		for (int i=0; i<notasAlumno.length;i++) {
			for (int j=0; j<notasAlumno[i].length;j++) {
				if (notasAlumno[i][j]>=5) {
					suspensoTotal = false;					
				}
			}
			if (!suspensoTotal) {
				break;
			}
			if (suspensoTotal=true) {
				break;
			}
		}
		return suspensoTotal;
	}
	
	public static boolean suspensoTotalAsignatura (double [][] notasAlumno) {
		
		boolean suspensoTotal = true;
		for (int i=0; i<notasAlumno[0].length;i++) {
			for (int j=0; j<notasAlumno.length;j++) {
				if (notasAlumno[j][i]>=5) {
					suspensoTotal = false;					
				}
			}
			if (!suspensoTotal) {
				break;
			}
			if (suspensoTotal=true) {
				break;
			}
		}
		return suspensoTotal;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		double [][] notasAlumnosAsignaturas = matrizNotas();
		imprimirNotasAlumno(notasAlumnosAsignaturas);
		imprimirNotasAsignatura(notasAlumnosAsignaturas);
		mediaAlumno(notasAlumnosAsignaturas);
		mediaAsignatura(notasAlumnosAsignaturas);
		System.out.printf("La asignatura más fácil es la %s \n", encontrarAsignaturaMasFacil(notasAlumnosAsignaturas)+1);
		if (suspensoTotalAlumno(notasAlumnosAsignaturas)==true) {
			System.out.println("Al menos un alumno ha suspendido todas las asignaturas");
		} else {
			System.out.println("No ha suspendido ningún alumno todas las asignaturas");
		}
		if (suspensoTotalAsignatura(notasAlumnosAsignaturas)==true) {
			System.out.println("Al menos en una asignatura han suspendido todas los alumnos");
		} else {
			System.out.println("En ninguna asignatura han suspendido todos los alumnos");
		}
	}
}

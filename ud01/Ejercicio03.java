package ud01;

public class Ejercicio03 {
	// ¿Cuáles de los siguientes identificadores son válidos y cuales no? Pruébalos cuando tengas duda;
	// Válidos Válidos: MiProblema, MiJuego, aaaaaaaaaaaa, Nombre_Apellidos, _5Java, Edad5, Int. De todas formas, algunas no cumplen con las convenciones expuestas en el temario para Java;
	
	public static void main (String arg[]){
		int MiProblema, MiJuego, aaaaaaaaaaaa, Nombre_Apellidos, _5Java, Edad5, Int;
		MiProblema = 0;
		MiJuego = 1;
		aaaaaaaaaaaa = 2;
		Nombre_Apellidos = 3;
		_5Java = 4;
		Edad5 = 5;
		Int = 6;
		System.out.println(MiProblema);
		System.out.println(MiJuego);
		System.out.println(aaaaaaaaaaaa);
		System.out.println(Nombre_Apellidos);
		System.out.println(_5Java);
		System.out.println(Edad5);
		System.out.println(Int);
		// int Mi Juego (contiene un espacio en blanco), Jose&Co (contiene un carácter especial "&"), A b(contiene un espacio en blanco), 1rApellido (comienza con un número), Saldo-actual (contiene un guión "-"), Universidad Alicante (contiene un espacio en blanco), Juan=Rubio (contiene un carácter especial "=");
		
	}
}

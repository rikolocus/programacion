package ud03;

import java.util.*;

public class Actividad32 {

	public static void main (String [] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduzca el día de su nacimiento: ");
		int dia = tec.nextInt();
		System.out.print("Introduzca el mes de su nacimiento en números: ");
		int mes = tec.nextInt();
		
		String horoscopo ="";
		switch (mes) {
		
			case 1:
				if (dia >=20&& dia<31) {
					horoscopo ="Acuario";
				} else if (dia < 20){
					horoscopo ="Capricornio";
				}
				break;
			case 2:
				if (dia <=18) {
					horoscopo ="Acuario";
				} else if (dia<19 && dia<30){
					horoscopo ="Piscis";
				}
				break;
			case 3:
				if (dia <=20) {
					horoscopo="Piscis";
				} else if (dia >20&& dia <32) {
					horoscopo ="Aries";
				}
				break;
			case 4:
				if (dia <=19) {
					horoscopo ="Aries";
				} else if (dia>19&& dia <31) {
					horoscopo="Tauro";
				}
				break;
			case 5:
				if (dia<=20) {
					horoscopo="Tauro";
				} else if (dia>20 && dia<32) {
					horoscopo="Géminis";
				}
				break;
			case 6:
				if (dia<=20) {
					horoscopo="Géminis";
				} else if (dia>20&& dia<30){
					horoscopo="Cáncer";
				}
				break;
			case 7:
				if (dia<=22) {
					horoscopo="Cáncer";
				} else if (dia>22&&dia<32){
					horoscopo="Leo";
				}
				break;
			case 8:
				if (dia<=22) {
					horoscopo="Leo";
				} else if (dia>22&&dia<32) {
					horoscopo="Virgo";
				}
				break;
			case 9:
				if (dia<=22) {
					horoscopo="Virgo";
				} else if (dia>22&&dia<31) {
					horoscopo="Libra";
				}
				break;
			case 10:
				if (dia<=22) {
					horoscopo="Libra";
				} else if (dia>22&&dia<32) {
					horoscopo="Escorpión";
				}
				break;
			case 11:
				if (dia<=21) {
					horoscopo="Escorpión";
				} else if (dia>21&&dia<31);
					horoscopo="Sagitario";
				break;
			case 12:
				if (dia<=21) {
					horoscopo="Sagitario";
				} else if (dia>21&&dia<32) {
					horoscopo="Capricornio";
				}
				break;
			default:
				horoscopo="Mes incorrecto";
				break;
		}
		System.out.print("Su horoscópo es: " + horoscopo);
		tec.close();
	}
}

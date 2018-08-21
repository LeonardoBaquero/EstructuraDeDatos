package PaqueteDeMonto;


import java.text.NumberFormat; // Esta clase proporciona la interfaz para formatear y analizar números.
import java.util.Scanner; // Clase para lectura de datos 

public class MontoEscrito1 {

	public static final String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho",
			"nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho",
			"diecinueve" };

	public static final String[] decenas = { "", // 0
			"", // 1
			"veinti", "treinta", "cuareta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa" };

	public static String convert(final int n) {
		if (n < 0) {
			return "Menos" + convert(-n);
		}

		if (n < 20) {
			return unidades[n];

		}

		if (n < 100) {
			return decenas[n / 10] + ((n % 10 != 0) ? "" : "") + unidades[n % 10];
			// Se utiliza el operador terniario '?'
		}

		if (n < 1000) {
			return unidades[n / 100] + " cien" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}
		return convert(n / 1000) + " mil" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
	}

	public static void main(final String[] args) {

		int n;
		Scanner numero = new Scanner(System.in);
		System.out.println("Ingrese el numero que desea ver en letras");
		n = numero.nextInt();
		System.out.println(NumberFormat.getInstance().format(n) + "=" + convert(n) + "'");

	}

	
	public static String[] getUnidades() {
		return unidades;
	}

	public static String[] getDecenas() {
		return decenas;
	}

}
	
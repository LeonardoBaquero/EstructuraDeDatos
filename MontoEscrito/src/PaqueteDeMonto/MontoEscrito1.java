package PaqueteDeMonto;
import java.text.NumberFormat;
import java.util.Scanner;

public class MontoEscrito1 {



public static final String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce",
"trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve" };

public static final String[] decenas = { 
		"", 		// 0
		"",		// 1
		"veinte", 	// 2
		"treinta", 	// 3
		"cuareta", 	// 4
		"cincuenta", 	// 5
		"sesenta", 	// 6
		"setenta",	// 7
		"ochenta", 	// 8
		"noventa" 	// 9
};

public static String convert(final int n) {
	if (n < 0) {
		return "Minus " + convert(-n);
	}

	if (n < 20) {
		return unidades[n];
	}

	if (n < 100) {
		return decenas[n / 10] + ((n % 10 != 0) ? " " : "") + unidades[n % 10];
	}

	if (n < 1000) {
		return unidades[n / 100] + " cien" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
	}

	if (n < 100000) {
		return convert(n / 1000) + " mil" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
	}

	if (n < 10000000) {
		return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
	}

	return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
}

public static void main(final String[] args) {

	int n;
	Scanner s=new Scanner(System.in);
    System.out.println("Ingrese el numero que desea ver en letras");
	n =s.nextInt();
	System.out.println(NumberFormat.getInstance().format(n) + "='" + convert(n) + "'");

}

}
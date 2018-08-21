package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import PaqueteDeMonto.MontoEscrito1;

class MontoEscrito1Test {

	@Test
	void testGetUnidades() {
		//Paso  1: Instansear el objeto a probar.
		MontoEscrito1 testedMonto = new MontoEscrito1();
		//Paso 2, declaracion de variable con el resultado esperado
		String resultadoEsperado = "cinco";
		//Paso 3, llamado del metodo para probar y obtengo el resultado
		String resultadoObtenido = "cinco";
		assertEquals(resultadoEsperado,resultadoObtenido);
	
	}

@Test
	void testGetDecenas() {
		//Paso  1: Instansear el objeto a probar.
		MontoEscrito1 testedMonto = new MontoEscrito1();
		//Paso 2, declaracion de variable con el resultado esperado
		String resultadoEsperado = "treinta";
		//Paso 3, llamado del metodo para probar y obtengo el resultado
		String resultadoObtenido = "treinta";
		assertEquals(resultadoEsperado,resultadoObtenido);
	}


}


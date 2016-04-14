package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testPerimetroCuadrados(){
		Cuadrado miCuadrado = new Cuadrado();
		Float valorEsperado = (float)16;
		
		Integer valorObtenido = miCuadrado.perimetro();
		Assert.assertEquals(valorEsperado, valorObtenido);
		miCuadrado = null;
	}		
	
	@Test
	public void testAreaCuadrados(){
		Cuadrado miCuadrado = new Cuadrado();
		Double valorEsperado = 16.0;
		
		Double valorObtenido = miCuadrado.area();
		Assert.assertEquals(valorEsperado, valorObtenido);
		miCuadrado = null;
	}

}

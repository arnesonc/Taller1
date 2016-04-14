package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {


	@Test
	public void TestPerimetroCuadrados(){
		Cuadrado miCuadrado = new Cuadrado();
		Float valorEsperado = (float)16;
		
		Integer valorObtenido = miCuadrado.perimetro();
		Assert.assertEquals(valorEsperado, valorObtenido);
		miCuadrado = null;
	}		
	
	@Test
	public void TestAreaCuadrados(){
		Cuadrado miCuadrado = new Cuadrado();
		Float valorEsperado = (Float)16.0;
		
		Double valorObtenido = miCuadrado.area();
		Assert.assertEquals(valorEsperado, valorObtenido);
		miCuadrado = null;
	}

}

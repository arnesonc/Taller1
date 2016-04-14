package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void deberiaObtenerPerimetroDelCirculo() {
		Float perimetroEsperado = (float)37.699112;
		
		Circulo circulo = new Circulo();
		Float perimetroObtenido = circulo.perimetro();
		Assert.assertEquals("El perimetro obtenido no es el perimetro esperado.", perimetroEsperado, perimetroObtenido);
	}
	
	@Test
	public void deberiaObtenerAreaDelCirculo() {
		Float areaEsperada = (float)113.097336;
		
		Circulo circulo = new Circulo();
		Float areaObtenida = circulo.area();
		Assert.assertEquals("El área obtenida no es la esperada.", areaEsperada, areaObtenida);
	}
}

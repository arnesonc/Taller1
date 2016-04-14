package ar.edu.unlam.tallerweb.tarea1;

import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void deberiaObtenerPerimetroDelCirculo() {
		Double perimetroEsperado = 37.69911184307752;
		
		Circulo circulo = new Circulo();
		Double perimetroObtenido = circulo.perimetro();
		Assert.assertEquals("El perimetro obtenido no es el perimetro esperado.", perimetroEsperado, perimetroObtenido);
	}
	
	@Test
	public void deberiaObtenerAreaDelCirculo() {
		Double areaEsperada = 113.09733552923255;
		
		Circulo circulo = new Circulo();
		Double areaObtenida = circulo.area();
		Assert.assertEquals("El área obtenida no es la esperada.", areaEsperada, areaObtenida);
	}
}

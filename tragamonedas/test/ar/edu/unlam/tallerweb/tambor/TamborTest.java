package ar.edu.unlam.tallerweb.tambor;

import org.junit.Assert;
import org.junit.Test;

public class TamborTest {

	@Test
	public void deberiaPoderObtenerPosicion() {
		Integer posicionMinimaEsperada = 1;
		Integer posicionMaximaEsperada = 8;
		Integer posicionObtenida = 0;

		Tambor tambor = new Tambor();
		tambor.girar();
		posicionObtenida = tambor.obtenerPosicion();

		Assert.assertTrue(posicionObtenida >= posicionMinimaEsperada);
		Assert.assertTrue(posicionObtenida <= posicionMaximaEsperada);
	}

	@Test
	public void deberiaPoderGirar() {
		
		Tambor tambor = new Tambor();
		Boolean pudoGirar = tambor.girar();
		
		Assert.assertTrue(pudoGirar);
	}
}

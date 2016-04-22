package ar.edu.unlam.tallerweb.tambor;

import org.junit.Assert;
import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void deberiaPoderSaberSiEntregaPemio() {
		Boolean valorObtenido = true;
		
		Tragamonedas tragamonedas = new Tragamonedas();
		valorObtenido = tragamonedas.entregaPremio();
		
		Assert.assertTrue(valorObtenido);
	}
	
	@Test
	public void deberiaPoderActivarTragamonedas() {
		Tragamonedas tragamonedas = new Tragamonedas();
		
		Boolean pudoActivarse = tragamonedas.activar();
		
		Assert.assertTrue(pudoActivarse);
	}
}

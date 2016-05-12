package ar.edu.unlam.tallerweb.excepciones;

import org.junit.Assert;
import org.junit.Test;

public class ExamenTest {

	Examen examen;

	public ExamenTest() {
		if (examen == null) {
			examen = new Examen();
		}
	}

	@Test
	public void verificaQueAlIniciarNotaSeaCero() {
		Integer notaEsperada = 0;
		Integer notaObtenida = examen.getNota();
		Assert.assertEquals(notaEsperada, notaObtenida);
	}

	@Test
	public void verificaSePuedaCalificar() {
		Integer notaEsperada = 10;
		try {
			examen.calificar(notaEsperada);
		} catch (Exception e) {
			
		}
		Integer notaObtenida = examen.getNota();
		Assert.assertEquals(notaEsperada, notaObtenida);
	}
	
	@Test(expected = Exception.class)
	public void verificaExcepcionNotaMenorCero() throws Exception{
			examen.calificar(-15);
	}
	
	@Test(expected = Exception.class)
	public void verificaExcepcionNotaMayorCero() throws Exception{
			examen.calificar(123);
	}
}

package ar.edu.unlam.tallerweb.excepciones;

import org.junit.*;

public class MateriaTest {
	Materia materia = null;
	
	@Before
	public void init(){
		materia = new Materia();
	}
	
	/*    Calificar   */
	
	@Test(expected = Exception.class)
	public void verificaNoSePuedaEvaluarParcialMenorDeUno() throws Exception{
		materia.evaluar(0, 8);
	}
	
	@Test(expected = Exception.class)
	public void verificaNoSePuedaEvaluarParcialMayorDeDos() throws Exception{
		materia.evaluar(3, 8);
	}
	
	@Test
	public void verificaSePuedaEvaluarParcialUno() throws Exception{
		boolean pudoCalificar = materia.evaluar(1, 8);
		Assert.assertTrue(pudoCalificar);
	}
	
	@Test
	public void verificaSePuedaEvaluarParcialDos() throws Exception{
		boolean pudoCalificar = materia.evaluar(2, 8);
		Assert.assertTrue(pudoCalificar);
	}
	
	/*   Recuperar     */
	
	@Test(expected = Exception.class)
	public void verificaNoSePuedaRecuperarParcialMenorDeUno() throws Exception{
		materia.recuperar(0, 8);
	}
	
	@Test(expected = Exception.class)
	public void verificaNoSePuedaRecuperarParcialMayorDeDos() throws Exception{
		materia.recuperar(3, 8);
	}
	
	@Test
	public void verificaSePuedaRecuperarParcialUno() throws Exception{
		boolean pudoCalificar = materia.recuperar(1, 8);
		Assert.assertTrue(pudoCalificar);
	}
	
	@Test
	public void verificaSePuedaRecuperarParcialDos() throws Exception{
		boolean pudoCalificar = materia.recuperar(2, 8);
		Assert.assertTrue(pudoCalificar);
	}
}

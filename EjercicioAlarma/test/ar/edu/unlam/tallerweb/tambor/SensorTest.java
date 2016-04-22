package ar.edu.unlam.tallerweb.tambor;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.alarma.Sensor;

public class SensorTest {

	@Test
	public void deberiaComprobarSensorDesactivado() {
		Boolean estaActivado = false;
		
		Sensor sensor = new Sensor();
		estaActivado = sensor.activado();
		
		Assert.assertFalse(estaActivado);
	}
	
	@Test
	public void deberiaComprobarSensorActivado() {
		Boolean estaActivado = false;
		
		Sensor sensor = new Sensor();
		sensor.activar();
		estaActivado = sensor.activado();
		
		Assert.assertTrue(estaActivado);
	}
}

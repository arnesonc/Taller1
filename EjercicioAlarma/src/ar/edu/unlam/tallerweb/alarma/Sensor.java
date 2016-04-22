package ar.edu.unlam.tallerweb.alarma;

public class Sensor {
	Boolean estadoSensor = false;
	
	public void activar(){
		estadoSensor = true;
	}
	
	public Boolean activado(){
		return estadoSensor;
	}
}

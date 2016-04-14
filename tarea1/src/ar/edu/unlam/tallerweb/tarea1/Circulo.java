package ar.edu.unlam.tallerweb.tarea1;

public class Circulo {
	public Float radio = (float)6;
	public Float pi = (float)Math.PI;
	
	public float perimetro(){
		return (2 * pi * radio);
	}
	
	public float area(){
		return( pi * (radio*radio));
	}
	
}

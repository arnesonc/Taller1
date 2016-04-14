package ar.edu.unlam.tallerweb.tarea1;

public class Circulo {
	public Double radio = 6.00;
	public Double pi = Math.PI;

	public Double perimetro() {
		return (2 * pi * radio);
	}

	public Double area() {
		return (pi * (radio * radio));
	}
}

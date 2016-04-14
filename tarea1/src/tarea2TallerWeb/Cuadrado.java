package tarea2TallerWeb;

public class Cuadrado {
	
	private Integer valorDelLado = 4;
	
	public Integer perimetro() {
		return 4 * valorDelLado;
	}

	public Double area() {
		return Math.pow(valorDelLado, 2);
	}
}

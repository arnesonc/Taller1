package ar.edu.unlam.tallerweb.obras;

public class Autor {
	
	private String nombre;
	
	public Autor(String nombre){
		this.setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

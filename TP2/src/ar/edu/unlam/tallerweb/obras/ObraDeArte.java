package ar.edu.unlam.tallerweb.obras;

public class ObraDeArte {
	
	private String nombre;
	public Autor autor;
	
	public ObraDeArte(String nombre, Autor autor){
		this.setNombre(nombre);
		this.autor = autor;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

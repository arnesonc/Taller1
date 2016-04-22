package ar.edu.unlam.tallerweb.tambor;

public class Tragamonedas {

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;

	private Integer posicionTambor1 = 1;
	private Integer posicionTambor2 = 1;
	private Integer posicionTambor3 = 1;

	public Tragamonedas() {
		if (tambor1 == null) {
			tambor1 = new Tambor();
		}

		if (tambor2 == null) {
			tambor2 = new Tambor();
		}

		if (tambor3 == null) {
			tambor3 = new Tambor();
		}
	}

	public Boolean activar() {
		return tambor1.girar() == tambor2.girar() == tambor3.girar();
	}
	
	public Boolean entregaPremio(){
		
		posicionTambor1 = tambor1.obtenerPosicion();
		posicionTambor2 = tambor2.obtenerPosicion();
		posicionTambor3 = tambor3.obtenerPosicion();
		
		Boolean posicionesIguales = false;
		
		if(posicionTambor1 == posicionTambor2 && posicionTambor2 == posicionTambor3){
			posicionesIguales = true;
		}
		
		return posicionesIguales;
	}
}

package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {

	private Integer notaPrimerParcial;
	private Integer notaSegundoParcial;
	
	public void calificarPrimerParcial(Integer nota) {
		notaPrimerParcial = nota;
	}
	
	public Integer getPrimerParcial() {
		return notaPrimerParcial;
	}

	public void calificarSegundoParcial(Integer nota) {
		notaSegundoParcial = nota;
	}

	public Integer getSegundoParcial() {
		return notaSegundoParcial;
	}

	public Boolean estaAprobado() {
		Boolean estaAprobado = false;

		if (notaPrimerParcial >= 4 && notaSegundoParcial >= 4) {
			estaAprobado = true;
		}

		return estaAprobado;
	}

	public Boolean estaPromocionado() {
		Boolean estaPromocionado = false;

		if (notaPrimerParcial >= 7 && notaSegundoParcial >= 7) {
			estaPromocionado = true;
		}

		return estaPromocionado;
	}
}

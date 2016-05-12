package ar.edu.unlam.tallerweb.excepciones;

public class Examen {
	private Integer nota = 0;

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public Integer getNota() {
		return nota;
	}

	public void calificar(Integer notaExamen) throws Exception{

		if (notaExamen < 0) {
			throw new Exception("La nota del examen no puede ser menor a cero.");
		}
		
		if (notaExamen > 10) {
			throw new Exception("La nota del examen no puede ser mayor a diez.");
		}

		setNota(notaExamen);
	}
}

package ar.edu.unlam.tallerweb.excepciones;

public class Materia {

	Examen examen1 = null;
	Examen examen2 = null;
	Integer cantidadCalificacionesExamen1 = 0;
	Integer cantidadCalificacionesExamen2 = 0;
	Integer cantidadRecuperacionesExamen1 = 0;
	Integer cantidadRecuperacionesExamen2 = 0;

	public Materia() {
		if (examen1 == null) {
			examen1 = new Examen();
		}

		if (examen2 == null) {
			examen2 = new Examen();
		}
	}

	public boolean evaluar(Integer parcial, Integer nota) throws Exception{

		switch(parcial){
		case 1:
			cantidadCalificacionesExamen1++;
			
			if(cantidadCalificacionesExamen1 > 1){
				throw new Exception("No se puede calificar dos veces el parcial uno.");
			}
			
			examen1.calificar(nota);
			
			break;
		case 2:
			cantidadCalificacionesExamen2++;
			
			if(cantidadCalificacionesExamen1 > 1){
				throw new Exception("No se puede calificar dos veces el parcial dos.");
			}
			
			examen2.calificar(nota);
			
			break;
		default:
			throw new Exception("El parcial ingresado solo puede tener el valor 1 o 2.");
		}
		
		return true;
	}

	public boolean recuperar(Integer parcial, Integer nota) throws Exception {

		switch(parcial){
		case 1:
			cantidadRecuperacionesExamen1++;
			
			if(cantidadRecuperacionesExamen1 > 2){
				throw new Exception("No se puede recuperar dos veces el parcial uno.");
			}
			
			examen1.calificar(nota);
			
			break;
		case 2:
			cantidadRecuperacionesExamen2++;
			
			if(cantidadRecuperacionesExamen2 > 2){
				throw new Exception("No se puede recuperar dos veces el parcial dos.");
			}
			
			examen2.calificar(nota);
			
			break;
		default:
			throw new Exception("El parcial ingresado solo puede tener el valor 1 o 2.");
		}
		
		return true;
	}
}

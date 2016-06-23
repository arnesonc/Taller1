package ar.edu.unlam.tallerweb.obras;

import java.util.HashSet;

public class CatalogoHashSet {
	HashSet<ObraDeArte> listaObrasDeArte;

	public CatalogoHashSet() {
		if (listaObrasDeArte == null) {
			listaObrasDeArte = new HashSet<ObraDeArte>();
		}
	}

	public Integer obtenerCantidadObras() {
		return listaObrasDeArte.size();
	}

	public void agregarObra(ObraDeArte obraDeArte) throws Exception {

		if (!listaObrasDeArte.add(obraDeArte)) {
			throw new Exception("La obra de arte ya existe.");
		} 
	}

	public boolean existeObra(ObraDeArte obraDeArte) {
		return listaObrasDeArte.contains(obraDeArte);
	}

	public HashSet<ObraDeArte> getObras() {
		return listaObrasDeArte;
	}
}

package ar.edu.unlam.tallerweb.obras;

import java.util.TreeSet;

public class Catalogo {
	TreeSet<ObraDeArte> listaObrasDeArte;

	public Catalogo() {
		if (listaObrasDeArte == null) {
			listaObrasDeArte = new TreeSet<ObraDeArte>(new ObraDeArteComparator());
		}
	}

	public Integer obtenerCantidadObras() {
		return listaObrasDeArte.size();
	}

	public void agregarObra(ObraDeArte obraDeArte) throws Exception {

		if (!existeObra(obraDeArte)) {
			listaObrasDeArte.add(obraDeArte);
		} else {
			throw new Exception("La obra de arte ya existe.");
		}
	}

	public boolean existeObra(ObraDeArte obraDeArte) {
		return listaObrasDeArte.contains(obraDeArte);
	}

	public TreeSet<ObraDeArte> getObras() {
		return listaObrasDeArte;
	}
}

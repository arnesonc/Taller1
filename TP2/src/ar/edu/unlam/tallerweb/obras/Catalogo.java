package ar.edu.unlam.tallerweb.obras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Catalogo {
	TreeSet<ObraDeArte> listaObrasDeArte;
	ArrayList<String> a = new ArrayList<String>();
	
	HashMap<String, TreeSet<String>> map = new HashMap<String, TreeSet<String>>();
	
	public Catalogo() {
		if (listaObrasDeArte == null) {
			//listaObrasDeArte = new TreeSet<ObraDeArte>(new ObraDeArteComparator());
			listaObrasDeArte = new TreeSet<ObraDeArte>(new Comparator<ObraDeArte>(){
				
				@Override
				public int compare(ObraDeArte obraDeArte1, ObraDeArte obraDeArte2){
					return obraDeArte1.getNombre().compareToIgnoreCase(obraDeArte2.getNombre());
				}
			});
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

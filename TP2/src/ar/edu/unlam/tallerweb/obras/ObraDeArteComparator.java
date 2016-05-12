package ar.edu.unlam.tallerweb.obras;

import java.util.Comparator;

public class ObraDeArteComparator implements Comparator<ObraDeArte>{

	@Override
	public int compare(ObraDeArte obraDeArte1, ObraDeArte obraDeArte2) {
		
		return obraDeArte1.getNombre().compareToIgnoreCase(obraDeArte2.getNombre());
	}

}

package es.iescamas.programacion.ej4;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		if(o1.getPrecio()<o2.getPrecio()) {
			return o1.getPrecio();
		}
		return o2.getAnyo();
	}

}
